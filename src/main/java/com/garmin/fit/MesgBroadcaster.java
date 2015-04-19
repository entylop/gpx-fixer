////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2015 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 14.20Release
// Tag = development/akw/14.20.00
////////////////////////////////////////////////////////////////////////////////

package com.garmin.fit;

import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class MesgBroadcaster implements MesgListener {
    private final Decode decode;
    private final MesgWithEventBroadcaster mesgWithEventBroadcaster;
    private final BufferedRecordMesgBroadcaster bufferedRecordMesgBroadcaster;
    private final List<MesgListener> mesgListeners;
    private final List<FileIdMesgListener> fileIdMesgListeners;
    private final List<FileCreatorMesgListener> fileCreatorMesgListeners;
    private final List<SoftwareMesgListener> softwareMesgListeners;
    private final List<SlaveDeviceMesgListener> slaveDeviceMesgListeners;
    private final List<CapabilitiesMesgListener> capabilitiesMesgListeners;
    private final List<FileCapabilitiesMesgListener> fileCapabilitiesMesgListeners;
    private final List<MesgCapabilitiesMesgListener> mesgCapabilitiesMesgListeners;
    private final List<FieldCapabilitiesMesgListener> fieldCapabilitiesMesgListeners;
    private final List<DeviceSettingsMesgListener> deviceSettingsMesgListeners;
    private final List<UserProfileMesgListener> userProfileMesgListeners;
    private final List<HrmProfileMesgListener> hrmProfileMesgListeners;
    private final List<SdmProfileMesgListener> sdmProfileMesgListeners;
    private final List<BikeProfileMesgListener> bikeProfileMesgListeners;
    private final List<ZonesTargetMesgListener> zonesTargetMesgListeners;
    private final List<SportMesgListener> sportMesgListeners;
    private final List<HrZoneMesgListener> hrZoneMesgListeners;
    private final List<SpeedZoneMesgListener> speedZoneMesgListeners;
    private final List<CadenceZoneMesgListener> cadenceZoneMesgListeners;
    private final List<PowerZoneMesgListener> powerZoneMesgListeners;
    private final List<MetZoneMesgListener> metZoneMesgListeners;
    private final List<GoalMesgListener> goalMesgListeners;
    private final List<ActivityMesgListener> activityMesgListeners;
    private final List<SessionMesgListener> sessionMesgListeners;
    private final List<LapMesgListener> lapMesgListeners;
    private final List<LengthMesgListener> lengthMesgListeners;
    private final List<RecordMesgListener> recordMesgListeners;
    private final List<EventMesgListener> eventMesgListeners;
    private final List<DeviceInfoMesgListener> deviceInfoMesgListeners;
    private final List<TrainingFileMesgListener> trainingFileMesgListeners;
    private final List<HrvMesgListener> hrvMesgListeners;
    private final List<CourseMesgListener> courseMesgListeners;
    private final List<CoursePointMesgListener> coursePointMesgListeners;
    private final List<WorkoutMesgListener> workoutMesgListeners;
    private final List<WorkoutStepMesgListener> workoutStepMesgListeners;
    private final List<ScheduleMesgListener> scheduleMesgListeners;
    private final List<TotalsMesgListener> totalsMesgListeners;
    private final List<WeightScaleMesgListener> weightScaleMesgListeners;
    private final List<BloodPressureMesgListener> bloodPressureMesgListeners;
    private final List<MonitoringInfoMesgListener> monitoringInfoMesgListeners;
    private final List<MonitoringMesgListener> monitoringMesgListeners;
    private final List<MemoGlobMesgListener> memoGlobMesgListeners;
    private final List<PadMesgListener> padMesgListeners;

    public MesgBroadcaster() {
        this(new Decode());
    }

    public MesgBroadcaster(Decode decode) {
        this.decode = decode;
        mesgWithEventBroadcaster = new MesgWithEventBroadcaster();
        bufferedRecordMesgBroadcaster = new BufferedRecordMesgBroadcaster();
        mesgListeners = new ArrayList<MesgListener>();
        fileIdMesgListeners = new ArrayList<FileIdMesgListener>();
        fileCreatorMesgListeners = new ArrayList<FileCreatorMesgListener>();
        softwareMesgListeners = new ArrayList<SoftwareMesgListener>();
        slaveDeviceMesgListeners = new ArrayList<SlaveDeviceMesgListener>();
        capabilitiesMesgListeners = new ArrayList<CapabilitiesMesgListener>();
        fileCapabilitiesMesgListeners = new ArrayList<FileCapabilitiesMesgListener>();
        mesgCapabilitiesMesgListeners = new ArrayList<MesgCapabilitiesMesgListener>();
        fieldCapabilitiesMesgListeners = new ArrayList<FieldCapabilitiesMesgListener>();
        deviceSettingsMesgListeners = new ArrayList<DeviceSettingsMesgListener>();
        userProfileMesgListeners = new ArrayList<UserProfileMesgListener>();
        hrmProfileMesgListeners = new ArrayList<HrmProfileMesgListener>();
        sdmProfileMesgListeners = new ArrayList<SdmProfileMesgListener>();
        bikeProfileMesgListeners = new ArrayList<BikeProfileMesgListener>();
        zonesTargetMesgListeners = new ArrayList<ZonesTargetMesgListener>();
        sportMesgListeners = new ArrayList<SportMesgListener>();
        hrZoneMesgListeners = new ArrayList<HrZoneMesgListener>();
        speedZoneMesgListeners = new ArrayList<SpeedZoneMesgListener>();
        cadenceZoneMesgListeners = new ArrayList<CadenceZoneMesgListener>();
        powerZoneMesgListeners = new ArrayList<PowerZoneMesgListener>();
        metZoneMesgListeners = new ArrayList<MetZoneMesgListener>();
        goalMesgListeners = new ArrayList<GoalMesgListener>();
        activityMesgListeners = new ArrayList<ActivityMesgListener>();
        sessionMesgListeners = new ArrayList<SessionMesgListener>();
        lapMesgListeners = new ArrayList<LapMesgListener>();
        lengthMesgListeners = new ArrayList<LengthMesgListener>();
        recordMesgListeners = new ArrayList<RecordMesgListener>();
        eventMesgListeners = new ArrayList<EventMesgListener>();
        deviceInfoMesgListeners = new ArrayList<DeviceInfoMesgListener>();
        trainingFileMesgListeners = new ArrayList<TrainingFileMesgListener>();
        hrvMesgListeners = new ArrayList<HrvMesgListener>();
        courseMesgListeners = new ArrayList<CourseMesgListener>();
        coursePointMesgListeners = new ArrayList<CoursePointMesgListener>();
        workoutMesgListeners = new ArrayList<WorkoutMesgListener>();
        workoutStepMesgListeners = new ArrayList<WorkoutStepMesgListener>();
        scheduleMesgListeners = new ArrayList<ScheduleMesgListener>();
        totalsMesgListeners = new ArrayList<TotalsMesgListener>();
        weightScaleMesgListeners = new ArrayList<WeightScaleMesgListener>();
        bloodPressureMesgListeners = new ArrayList<BloodPressureMesgListener>();
        monitoringInfoMesgListeners = new ArrayList<MonitoringInfoMesgListener>();
        monitoringMesgListeners = new ArrayList<MonitoringMesgListener>();
        memoGlobMesgListeners = new ArrayList<MemoGlobMesgListener>();
        padMesgListeners = new ArrayList<PadMesgListener>();
    }

    public void setSystemTimeOffset(long offset) {
        decode.setSystemTimeOffset(offset);
    }

    public void run(final InputStream in) {
        try {
            while (in.available() > 0) { // Try to read a file while more data is available.
                decode.read(in, this); // Run decoder.
                decode.nextFile(); // Initialize to read next file (if any).
            }
        } catch (java.io.IOException e) {
        }
    }

    public void addListener(MesgListener mesgListener) {
        mesgListeners.add(mesgListener);
    }

    public void addListener(MesgWithEventListener mesgListener) {
        mesgWithEventBroadcaster.addListener(mesgListener);
    }

    public void addListener(BufferedRecordMesgListener bufferedRecordMesgListener) {
        bufferedRecordMesgBroadcaster.addListener(bufferedRecordMesgListener);
    }

    public void addListener(FileIdMesgListener fileIdMesgListener) {
        fileIdMesgListeners.add(fileIdMesgListener);
    }

    public void addListener(FileCreatorMesgListener fileCreatorMesgListener) {
        fileCreatorMesgListeners.add(fileCreatorMesgListener);
    }

    public void addListener(SoftwareMesgListener softwareMesgListener) {
        softwareMesgListeners.add(softwareMesgListener);
    }

    public void addListener(SlaveDeviceMesgListener slaveDeviceMesgListener) {
        slaveDeviceMesgListeners.add(slaveDeviceMesgListener);
    }

    public void addListener(CapabilitiesMesgListener capabilitiesMesgListener) {
        capabilitiesMesgListeners.add(capabilitiesMesgListener);
    }

    public void addListener(FileCapabilitiesMesgListener fileCapabilitiesMesgListener) {
        fileCapabilitiesMesgListeners.add(fileCapabilitiesMesgListener);
    }

    public void addListener(MesgCapabilitiesMesgListener mesgCapabilitiesMesgListener) {
        mesgCapabilitiesMesgListeners.add(mesgCapabilitiesMesgListener);
    }

    public void addListener(FieldCapabilitiesMesgListener fieldCapabilitiesMesgListener) {
        fieldCapabilitiesMesgListeners.add(fieldCapabilitiesMesgListener);
    }

    public void addListener(DeviceSettingsMesgListener deviceSettingsMesgListener) {
        deviceSettingsMesgListeners.add(deviceSettingsMesgListener);
    }

    public void addListener(UserProfileMesgListener userProfileMesgListener) {
        userProfileMesgListeners.add(userProfileMesgListener);
    }

    public void addListener(HrmProfileMesgListener hrmProfileMesgListener) {
        hrmProfileMesgListeners.add(hrmProfileMesgListener);
    }

    public void addListener(SdmProfileMesgListener sdmProfileMesgListener) {
        sdmProfileMesgListeners.add(sdmProfileMesgListener);
    }

    public void addListener(BikeProfileMesgListener bikeProfileMesgListener) {
        bikeProfileMesgListeners.add(bikeProfileMesgListener);
    }

    public void addListener(ZonesTargetMesgListener zonesTargetMesgListener) {
        zonesTargetMesgListeners.add(zonesTargetMesgListener);
    }

    public void addListener(SportMesgListener sportMesgListener) {
        sportMesgListeners.add(sportMesgListener);
    }

    public void addListener(HrZoneMesgListener hrZoneMesgListener) {
        hrZoneMesgListeners.add(hrZoneMesgListener);
    }

    public void addListener(SpeedZoneMesgListener speedZoneMesgListener) {
        speedZoneMesgListeners.add(speedZoneMesgListener);
    }

    public void addListener(CadenceZoneMesgListener cadenceZoneMesgListener) {
        cadenceZoneMesgListeners.add(cadenceZoneMesgListener);
    }

    public void addListener(PowerZoneMesgListener powerZoneMesgListener) {
        powerZoneMesgListeners.add(powerZoneMesgListener);
    }

    public void addListener(MetZoneMesgListener metZoneMesgListener) {
        metZoneMesgListeners.add(metZoneMesgListener);
    }

    public void addListener(GoalMesgListener goalMesgListener) {
        goalMesgListeners.add(goalMesgListener);
    }

    public void addListener(ActivityMesgListener activityMesgListener) {
        activityMesgListeners.add(activityMesgListener);
    }

    public void addListener(SessionMesgListener sessionMesgListener) {
        sessionMesgListeners.add(sessionMesgListener);
    }

    public void addListener(LapMesgListener lapMesgListener) {
        lapMesgListeners.add(lapMesgListener);
    }

    public void addListener(LengthMesgListener lengthMesgListener) {
        lengthMesgListeners.add(lengthMesgListener);
    }

    public void addListener(RecordMesgListener recordMesgListener) {
        recordMesgListeners.add(recordMesgListener);
    }

    public void addListener(EventMesgListener eventMesgListener) {
        eventMesgListeners.add(eventMesgListener);
    }

    public void addListener(DeviceInfoMesgListener deviceInfoMesgListener) {
        deviceInfoMesgListeners.add(deviceInfoMesgListener);
    }

    public void addListener(TrainingFileMesgListener trainingFileMesgListener) {
        trainingFileMesgListeners.add(trainingFileMesgListener);
    }

    public void addListener(HrvMesgListener hrvMesgListener) {
        hrvMesgListeners.add(hrvMesgListener);
    }

    public void addListener(CourseMesgListener courseMesgListener) {
        courseMesgListeners.add(courseMesgListener);
    }

    public void addListener(CoursePointMesgListener coursePointMesgListener) {
        coursePointMesgListeners.add(coursePointMesgListener);
    }

    public void addListener(WorkoutMesgListener workoutMesgListener) {
        workoutMesgListeners.add(workoutMesgListener);
    }

    public void addListener(WorkoutStepMesgListener workoutStepMesgListener) {
        workoutStepMesgListeners.add(workoutStepMesgListener);
    }

    public void addListener(ScheduleMesgListener scheduleMesgListener) {
        scheduleMesgListeners.add(scheduleMesgListener);
    }

    public void addListener(TotalsMesgListener totalsMesgListener) {
        totalsMesgListeners.add(totalsMesgListener);
    }

    public void addListener(WeightScaleMesgListener weightScaleMesgListener) {
        weightScaleMesgListeners.add(weightScaleMesgListener);
    }

    public void addListener(BloodPressureMesgListener bloodPressureMesgListener) {
        bloodPressureMesgListeners.add(bloodPressureMesgListener);
    }

    public void addListener(MonitoringInfoMesgListener monitoringInfoMesgListener) {
        monitoringInfoMesgListeners.add(monitoringInfoMesgListener);
    }

    public void addListener(MonitoringMesgListener monitoringMesgListener) {
        monitoringMesgListeners.add(monitoringMesgListener);
    }

    public void addListener(MemoGlobMesgListener memoGlobMesgListener) {
        memoGlobMesgListeners.add(memoGlobMesgListener);
    }

    public void addListener(PadMesgListener padMesgListener) {
        padMesgListeners.add(padMesgListener);
    }

    public void onMesg(final Mesg mesg) {
        for (final MesgListener mesgListener : mesgListeners)
            mesgListener.onMesg(mesg);

        System.out.println("MESG:" + mesg.getNum() + ":" + mesg.getName());

        switch (mesg.getNum()) {
        case MesgNum.FILE_ID:
            final FileIdMesg fileIdMesg = new FileIdMesg(mesg);
            for (final FileIdMesgListener mesgListener : fileIdMesgListeners)
                mesgListener.onMesg(fileIdMesg);
            break;
        case MesgNum.FILE_CREATOR:
            final FileCreatorMesg fileCreatorMesg = new FileCreatorMesg(mesg);
            for (final FileCreatorMesgListener mesgListener : fileCreatorMesgListeners)
                mesgListener.onMesg(fileCreatorMesg);
            break;
        case MesgNum.SOFTWARE:
            final SoftwareMesg softwareMesg = new SoftwareMesg(mesg);
            for (final SoftwareMesgListener mesgListener : softwareMesgListeners)
                mesgListener.onMesg(softwareMesg);
            break;
        case MesgNum.SLAVE_DEVICE:
            final SlaveDeviceMesg slaveDeviceMesg = new SlaveDeviceMesg(mesg);
            for (final SlaveDeviceMesgListener mesgListener : slaveDeviceMesgListeners)
                mesgListener.onMesg(slaveDeviceMesg);
            break;
        case MesgNum.CAPABILITIES:
            final CapabilitiesMesg capabilitiesMesg = new CapabilitiesMesg(mesg);
            for (final CapabilitiesMesgListener mesgListener : capabilitiesMesgListeners)
                mesgListener.onMesg(capabilitiesMesg);
            break;
        case MesgNum.FILE_CAPABILITIES:
            final FileCapabilitiesMesg fileCapabilitiesMesg = new FileCapabilitiesMesg(mesg);
            for (final FileCapabilitiesMesgListener mesgListener : fileCapabilitiesMesgListeners)
                mesgListener.onMesg(fileCapabilitiesMesg);
            break;
        case MesgNum.MESG_CAPABILITIES:
            final MesgCapabilitiesMesg mesgCapabilitiesMesg = new MesgCapabilitiesMesg(mesg);
            for (final MesgCapabilitiesMesgListener mesgListener : mesgCapabilitiesMesgListeners)
                mesgListener.onMesg(mesgCapabilitiesMesg);
            break;
        case MesgNum.FIELD_CAPABILITIES:
            final FieldCapabilitiesMesg fieldCapabilitiesMesg = new FieldCapabilitiesMesg(mesg);
            for (final FieldCapabilitiesMesgListener mesgListener : fieldCapabilitiesMesgListeners)
                mesgListener.onMesg(fieldCapabilitiesMesg);
            break;
        case MesgNum.DEVICE_SETTINGS:
            final DeviceSettingsMesg deviceSettingsMesg = new DeviceSettingsMesg(mesg);
            for (final DeviceSettingsMesgListener mesgListener : deviceSettingsMesgListeners)
                mesgListener.onMesg(deviceSettingsMesg);
            break;
        case MesgNum.USER_PROFILE:
            final UserProfileMesg userProfileMesg = new UserProfileMesg(mesg);
            for (final UserProfileMesgListener mesgListener : userProfileMesgListeners)
                mesgListener.onMesg(userProfileMesg);
            break;
        case MesgNum.HRM_PROFILE:
            final HrmProfileMesg hrmProfileMesg = new HrmProfileMesg(mesg);
            for (final HrmProfileMesgListener mesgListener : hrmProfileMesgListeners)
                mesgListener.onMesg(hrmProfileMesg);
            break;
        case MesgNum.SDM_PROFILE:
            final SdmProfileMesg sdmProfileMesg = new SdmProfileMesg(mesg);
            for (final SdmProfileMesgListener mesgListener : sdmProfileMesgListeners)
                mesgListener.onMesg(sdmProfileMesg);
            break;
        case MesgNum.BIKE_PROFILE:
            final BikeProfileMesg bikeProfileMesg = new BikeProfileMesg(mesg);
            for (final BikeProfileMesgListener mesgListener : bikeProfileMesgListeners)
                mesgListener.onMesg(bikeProfileMesg);
            break;
        case MesgNum.ZONES_TARGET:
            final ZonesTargetMesg zonesTargetMesg = new ZonesTargetMesg(mesg);
            for (final ZonesTargetMesgListener mesgListener : zonesTargetMesgListeners)
                mesgListener.onMesg(zonesTargetMesg);
            break;
        case MesgNum.SPORT:
            final SportMesg sportMesg = new SportMesg(mesg);
            for (final SportMesgListener mesgListener : sportMesgListeners)
                mesgListener.onMesg(sportMesg);
            break;
        case MesgNum.HR_ZONE:
            final HrZoneMesg hrZoneMesg = new HrZoneMesg(mesg);
            for (final HrZoneMesgListener mesgListener : hrZoneMesgListeners)
                mesgListener.onMesg(hrZoneMesg);
            break;
        case MesgNum.SPEED_ZONE:
            final SpeedZoneMesg speedZoneMesg = new SpeedZoneMesg(mesg);
            for (final SpeedZoneMesgListener mesgListener : speedZoneMesgListeners)
                mesgListener.onMesg(speedZoneMesg);
            break;
        case MesgNum.CADENCE_ZONE:
            final CadenceZoneMesg cadenceZoneMesg = new CadenceZoneMesg(mesg);
            for (final CadenceZoneMesgListener mesgListener : cadenceZoneMesgListeners)
                mesgListener.onMesg(cadenceZoneMesg);
            break;
        case MesgNum.POWER_ZONE:
            final PowerZoneMesg powerZoneMesg = new PowerZoneMesg(mesg);
            for (final PowerZoneMesgListener mesgListener : powerZoneMesgListeners)
                mesgListener.onMesg(powerZoneMesg);
            break;
        case MesgNum.MET_ZONE:
            final MetZoneMesg metZoneMesg = new MetZoneMesg(mesg);
            for (final MetZoneMesgListener mesgListener : metZoneMesgListeners)
                mesgListener.onMesg(metZoneMesg);
            break;
        case MesgNum.GOAL:
            final GoalMesg goalMesg = new GoalMesg(mesg);
            for (final GoalMesgListener mesgListener : goalMesgListeners)
                mesgListener.onMesg(goalMesg);
            break;
        case MesgNum.ACTIVITY:
            final ActivityMesg activityMesg = new ActivityMesg(mesg);
            for (final ActivityMesgListener mesgListener : activityMesgListeners)
                mesgListener.onMesg(activityMesg);
            mesgWithEventBroadcaster.onMesg(activityMesg);
            break;
        case MesgNum.SESSION:
            final SessionMesg sessionMesg = new SessionMesg(mesg);
            for (final SessionMesgListener mesgListener : sessionMesgListeners)
                mesgListener.onMesg(sessionMesg);
            mesgWithEventBroadcaster.onMesg(sessionMesg);
            break;
        case MesgNum.LAP:
            final LapMesg lapMesg = new LapMesg(mesg);
            for (final LapMesgListener mesgListener : lapMesgListeners)
                mesgListener.onMesg(lapMesg);
            mesgWithEventBroadcaster.onMesg(lapMesg);
            break;
        case MesgNum.LENGTH:
            final LengthMesg lengthMesg = new LengthMesg(mesg);
            for (final LengthMesgListener mesgListener : lengthMesgListeners)
                mesgListener.onMesg(lengthMesg);
            mesgWithEventBroadcaster.onMesg(lengthMesg);
            break;
        case MesgNum.RECORD:
            final RecordMesg recordMesg = new RecordMesg(mesg);
            for (final RecordMesgListener mesgListener : recordMesgListeners)
                mesgListener.onMesg(recordMesg);
            bufferedRecordMesgBroadcaster.onMesg(recordMesg);
            break;
        case MesgNum.EVENT:
            final EventMesg eventMesg = new EventMesg(mesg);
            for (final EventMesgListener mesgListener : eventMesgListeners)
                mesgListener.onMesg(eventMesg);
            mesgWithEventBroadcaster.onMesg(eventMesg);
            break;
        case MesgNum.DEVICE_INFO:
            final DeviceInfoMesg deviceInfoMesg = new DeviceInfoMesg(mesg);
            for (final DeviceInfoMesgListener mesgListener : deviceInfoMesgListeners)
                mesgListener.onMesg(deviceInfoMesg);
            break;
        case MesgNum.TRAINING_FILE:
            final TrainingFileMesg trainingFileMesg = new TrainingFileMesg(mesg);
            for (final TrainingFileMesgListener mesgListener : trainingFileMesgListeners)
                mesgListener.onMesg(trainingFileMesg);
            break;
        case MesgNum.HRV:
            final HrvMesg hrvMesg = new HrvMesg(mesg);
            for (final HrvMesgListener mesgListener : hrvMesgListeners)
                mesgListener.onMesg(hrvMesg);
            break;
        case MesgNum.COURSE:
            final CourseMesg courseMesg = new CourseMesg(mesg);
            for (final CourseMesgListener mesgListener : courseMesgListeners)
                mesgListener.onMesg(courseMesg);
            break;
        case MesgNum.COURSE_POINT:
            final CoursePointMesg coursePointMesg = new CoursePointMesg(mesg);
            for (final CoursePointMesgListener mesgListener : coursePointMesgListeners)
                mesgListener.onMesg(coursePointMesg);
            break;
        case MesgNum.WORKOUT:
            final WorkoutMesg workoutMesg = new WorkoutMesg(mesg);
            for (final WorkoutMesgListener mesgListener : workoutMesgListeners)
                mesgListener.onMesg(workoutMesg);
            break;
        case MesgNum.WORKOUT_STEP:
            final WorkoutStepMesg workoutStepMesg = new WorkoutStepMesg(mesg);
            for (final WorkoutStepMesgListener mesgListener : workoutStepMesgListeners)
                mesgListener.onMesg(workoutStepMesg);
            break;
        case MesgNum.SCHEDULE:
            final ScheduleMesg scheduleMesg = new ScheduleMesg(mesg);
            for (final ScheduleMesgListener mesgListener : scheduleMesgListeners)
                mesgListener.onMesg(scheduleMesg);
            break;
        case MesgNum.TOTALS:
            final TotalsMesg totalsMesg = new TotalsMesg(mesg);
            for (final TotalsMesgListener mesgListener : totalsMesgListeners)
                mesgListener.onMesg(totalsMesg);
            break;
        case MesgNum.WEIGHT_SCALE:
            final WeightScaleMesg weightScaleMesg = new WeightScaleMesg(mesg);
            for (final WeightScaleMesgListener mesgListener : weightScaleMesgListeners)
                mesgListener.onMesg(weightScaleMesg);
            break;
        case MesgNum.BLOOD_PRESSURE:
            final BloodPressureMesg bloodPressureMesg = new BloodPressureMesg(mesg);
            for (final BloodPressureMesgListener mesgListener : bloodPressureMesgListeners)
                mesgListener.onMesg(bloodPressureMesg);
            break;
        case MesgNum.MONITORING_INFO:
            final MonitoringInfoMesg monitoringInfoMesg = new MonitoringInfoMesg(mesg);
            for (final MonitoringInfoMesgListener mesgListener : monitoringInfoMesgListeners)
                mesgListener.onMesg(monitoringInfoMesg);
            break;
        case MesgNum.MONITORING:
            final MonitoringMesg monitoringMesg = new MonitoringMesg(mesg);
            for (final MonitoringMesgListener mesgListener : monitoringMesgListeners)
                mesgListener.onMesg(monitoringMesg);
            break;
        case MesgNum.MEMO_GLOB:
            final MemoGlobMesg memoGlobMesg = new MemoGlobMesg(mesg);
            for (final MemoGlobMesgListener mesgListener : memoGlobMesgListeners)
                mesgListener.onMesg(memoGlobMesg);
            break;
        case MesgNum.PAD:
            final PadMesg padMesg = new PadMesg(mesg);
            for (final PadMesgListener mesgListener : padMesgListeners)
                mesgListener.onMesg(padMesg);
            break;

        default:
            
            break;
        }
    }

}
