package net.hivert.gpxfixer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.garmin.fit.FileEncoder;
import com.garmin.fit.FitRuntimeException;
import com.garmin.fit.Mesg;

/**
 * This class takes a fit file and removes any weird time gap. For some reason some garmin devices
 * suddenly use a date in the future while recording an activity.
 */
public class FitFileFixer {
    private static final int GAPS_IN_SECONDS = 3600;

    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];
        process(input, output, GAPS_IN_SECONDS);
    }

    private static void process(String fitFilename, String output, int gapInSeconds) {
        // load the data from the input file
        final List<Mesg> messages = readAllMesgsAndFixTimeStamps(fitFilename, gapInSeconds);

        writeMessagesToFile(output, messages);
    }

    private static void writeMessagesToFile(String output, final List<Mesg> messages) {
        FileEncoder encode;
        try {
            encode = new FileEncoder(new java.io.File(output));
            encode.write(messages);
            encode.close();
        } catch (FitRuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Mesg> readAllMesgsAndFixTimeStamps(String fitFilename, int gapInSeconds) {
        final ArrayList<Mesg> messages = new ArrayList<Mesg>();
        try {
            FitFileReader reader = new FitFileReader();

            GenericMesgListener genericListener = new GenericMesgListener(messages, gapInSeconds);
            reader.setGenericListener(genericListener);

            try (InputStream is = new FileInputStream(fitFilename)) {
                reader.read(is);
            }

            System.out.println("total distance in meters=" + genericListener.distance);
            System.out.println("total distance in miles=" + genericListener.distance / 1609.0);
            return messages;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}