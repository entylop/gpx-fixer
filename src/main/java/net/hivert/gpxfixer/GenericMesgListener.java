package net.hivert.gpxfixer;

import java.util.ArrayList;

import com.garmin.fit.DateTime;
import com.garmin.fit.Field;
import com.garmin.fit.Mesg;
import com.garmin.fit.MesgListener;
import com.garmin.fit.MesgNum;
import com.garmin.fit.RecordMesg;

/**
 * A generic message listener that gathers messages and modifies them if there is any time gap.
 * 
 * @author Christophe Hivert
 *
 */
final class GenericMesgListener implements MesgListener {
    private final ArrayList<Mesg> messages;
    Long lastTimeStamp;
    long offset = 0;
    long distance = 0;
    long lastDistance = 0;
    int index = 1;
    long start = 0;
    private int gapInSeconds;

    GenericMesgListener(ArrayList<Mesg> messages, int gapInSeconds) {
        this.messages = messages;
        this.gapInSeconds = gapInSeconds;
    }

    @Override
    public void onMesg(Mesg rawMesg) {
        Mesg correctedMesg = new Mesg(rawMesg);

        Field field = correctedMesg.getField("timestamp");
        if (field != null) {
            Long longValue = field.getLongValue();

            if (lastTimeStamp != null) {
                long duration = longValue - lastTimeStamp;
                if (duration > gapInSeconds && offset == 0) {
                    System.out.println();
                    System.out.println("Trouble with " + rawMesg.getName() + ". Duration=" + duration);
                    offset = duration - 6;
                }
                if (offset > 0) {
                    correctedMesg.setFieldValue(field.getNum(), longValue - offset);
                }
            }
        }

        if (correctedMesg.getNum() == MesgNum.RECORD) {
            RecordMesg record = new RecordMesg(correctedMesg);
            DateTime timestamp = record.getTimestamp();
            if (start == 0) {
                start = timestamp.getTimestamp();
            }

            distance = record.getDistance().longValue();

            long time = record.getTimestamp().getTimestamp() - start;
            int totalSeconds = (int) time;
            int seconds = totalSeconds % 60;
            int totalMinutes = totalSeconds / 60;
            int minutes = totalMinutes % 60;
            int hours = (int) totalMinutes / 60;

            double altitudeMeters = record.getAltitude();
            double altitudeFeet = altitudeMeters / 0.3048;

            System.out.println(index + ":" + distance + "m " + (distance / 1609.0) + "mi " + (distance - lastDistance)
                    + "m a=" + altitudeFeet + "ft " + hours + ":" + minutes + ":" + seconds + " t="
                    + record.getTimestamp());

            lastDistance = distance;
            index++;
        }

        Field newTimeStampField = correctedMesg.getField("timestamp");
        if (newTimeStampField != null) {
            Long longValue = newTimeStampField.getLongValue();
            lastTimeStamp = longValue;
        }

        messages.add(correctedMesg);
    }
}