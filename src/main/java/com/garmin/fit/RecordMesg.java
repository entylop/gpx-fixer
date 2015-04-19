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


public class RecordMesg extends Mesg {

   protected static final	Mesg recordMesg;
   static {int field_index = 0;         
      // record   
      recordMesg = new Mesg("record", MesgNum.RECORD);
      recordMesg.addField(new Field("timestamp", 253, 134, 1, 0, "s", false));
      field_index++;
      recordMesg.addField(new Field("position_lat", 0, 133, 1, 0, "semicircles", false));
      field_index++;
      recordMesg.addField(new Field("position_long", 1, 133, 1, 0, "semicircles", false));
      field_index++;
      recordMesg.addField(new Field("altitude", 2, 132, 5, 500, "m", false)); 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(78, false, 16, 5, 500)); // enhanced_altitude
      field_index++;
      recordMesg.addField(new Field("heart_rate", 3, 2, 1, 0, "bpm", false));
      field_index++;
      recordMesg.addField(new Field("cadence", 4, 2, 1, 0, "rpm", false));
      field_index++;
      recordMesg.addField(new Field("distance", 5, 134, 100, 0, "m", true));
      field_index++;
      recordMesg.addField(new Field("speed", 6, 132, 1000, 0, "m/s", false)); 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(73, false, 16, 1000, 0)); // enhanced_speed
      field_index++;
      recordMesg.addField(new Field("power", 7, 132, 1, 0, "watts", false));
      field_index++;
      recordMesg.addField(new Field("compressed_speed_distance", 8, 13, 1, 0, "", false)); 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(6, false, 12, 100, 0)); // speed 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(5, true, 12, 16, 0)); // distance
      field_index++;
      recordMesg.addField(new Field("grade", 9, 131, 100, 0, "%", false));
      field_index++;
      recordMesg.addField(new Field("resistance", 10, 2, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("time_from_course", 11, 133, 1000, 0, "s", false));
      field_index++;
      recordMesg.addField(new Field("cycle_length", 12, 2, 100, 0, "m", false));
      field_index++;
      recordMesg.addField(new Field("temperature", 13, 1, 1, 0, "C", false));
      field_index++;
      recordMesg.addField(new Field("speed_1s", 17, 2, 16, 0, "m/s", false));
      field_index++;
      recordMesg.addField(new Field("cycles", 18, 2, 1, 0, "cycles", false)); 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(19, true, 8, 1, 0)); // total_cycles
      field_index++;
      recordMesg.addField(new Field("total_cycles", 19, 134, 1, 0, "cycles", true));
      field_index++;
      recordMesg.addField(new Field("compressed_accumulated_power", 28, 132, 1, 0, "watts", false)); 
      recordMesg.fields.get(field_index).components.add(new FieldComponent(29, true, 16, 1, 0)); // accumulated_power
      field_index++;
      recordMesg.addField(new Field("accumulated_power", 29, 134, 1, 0, "watts", true));
      field_index++;
      recordMesg.addField(new Field("left_right_balance", 30, 2, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("gps_accuracy", 31, 2, 1, 0, "m", false));
      field_index++;
      recordMesg.addField(new Field("vertical_speed", 32, 131, 1000, 0, "m/s", false));
      field_index++;
      recordMesg.addField(new Field("calories", 33, 132, 1, 0, "kcal", false));
      field_index++;
      recordMesg.addField(new Field("vertical_oscillation", 39, 132, 10, 0, "mm", false));
      field_index++;
      recordMesg.addField(new Field("stance_time_percent", 40, 132, 100, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("stance_time", 41, 132, 10, 0, "ms", false));
      field_index++;
      recordMesg.addField(new Field("activity_type", 42, 0, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("left_torque_effectiveness", 43, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("right_torque_effectiveness", 44, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("left_pedal_smoothness", 45, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("right_pedal_smoothness", 46, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("combined_pedal_smoothness", 47, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("time128", 48, 2, 128, 0, "s", false));
      field_index++;
      recordMesg.addField(new Field("stroke_type", 49, 0, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("zone", 50, 2, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("ball_speed", 51, 132, 100, 0, "m/s", false));
      field_index++;
      recordMesg.addField(new Field("cadence256", 52, 132, 256, 0, "rpm", false));
      field_index++;
      recordMesg.addField(new Field("fractional_cadence", 53, 2, 128, 0, "rpm", false));
      field_index++;
      recordMesg.addField(new Field("total_hemoglobin_conc", 54, 132, 100, 0, "g/dL", false));
      field_index++;
      recordMesg.addField(new Field("total_hemoglobin_conc_min", 55, 132, 100, 0, "g/dL", false));
      field_index++;
      recordMesg.addField(new Field("total_hemoglobin_conc_max", 56, 132, 100, 0, "g/dL", false));
      field_index++;
      recordMesg.addField(new Field("saturated_hemoglobin_percent", 57, 132, 10, 0, "%", false));
      field_index++;
      recordMesg.addField(new Field("saturated_hemoglobin_percent_min", 58, 132, 10, 0, "%", false));
      field_index++;
      recordMesg.addField(new Field("saturated_hemoglobin_percent_max", 59, 132, 10, 0, "%", false));
      field_index++;
      recordMesg.addField(new Field("device_index", 62, 2, 1, 0, "", false));
      field_index++;
      recordMesg.addField(new Field("left_pco", 67, 1, 1, 0, "mm", false));
      field_index++;
      recordMesg.addField(new Field("right_pco", 68, 1, 1, 0, "mm", false));
      field_index++;
      recordMesg.addField(new Field("left_power_phase", 69, 2, 0.7111111, 0, "degrees", false));
      field_index++;
      recordMesg.addField(new Field("left_power_phase_peak", 70, 2, 0.7111111, 0, "degrees", false));
      field_index++;
      recordMesg.addField(new Field("right_power_phase", 71, 2, 0.7111111, 0, "degrees", false));
      field_index++;
      recordMesg.addField(new Field("right_power_phase_peak", 72, 2, 0.7111111, 0, "degrees", false));
      field_index++;
      recordMesg.addField(new Field("enhanced_speed", 73, 134, 1000, 0, "m/s", false));
      field_index++;
      recordMesg.addField(new Field("enhanced_altitude", 78, 134, 5, 500, "m", false));
      field_index++;
      recordMesg.addField(new Field("battery_soc", 81, 2, 2, 0, "percent", false));
      field_index++;
      recordMesg.addField(new Field("motor_power", 82, 132, 1, 0, "watts", false));
      field_index++;
   }

   public RecordMesg() {
      super(Factory.createMesg(MesgNum.RECORD));
   }

   public RecordMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get timestamp field
    * Units: s
    *
    * @return timestamp
    */
   public DateTime getTimestamp() {
      return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
   }

   /**
    * Set timestamp field
    * Units: s
    *
    * @param timestamp
    */
   public void setTimestamp(DateTime timestamp) {
      setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get position_lat field
    * Units: semicircles
    *
    * @return position_lat
    */
   public Integer getPositionLat() {
      return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set position_lat field
    * Units: semicircles
    *
    * @param positionLat
    */
   public void setPositionLat(Integer positionLat) {
      setFieldValue(0, 0, positionLat, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get position_long field
    * Units: semicircles
    *
    * @return position_long
    */
   public Integer getPositionLong() {
      return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set position_long field
    * Units: semicircles
    *
    * @param positionLong
    */
   public void setPositionLong(Integer positionLong) {
      setFieldValue(1, 0, positionLong, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get altitude field
    * Units: m
    *
    * @return altitude
    */
   public Float getAltitude() {
      return getFieldFloatValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set altitude field
    * Units: m
    *
    * @param altitude
    */
   public void setAltitude(Float altitude) {
      setFieldValue(2, 0, altitude, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get heart_rate field
    * Units: bpm
    *
    * @return heart_rate
    */
   public Short getHeartRate() {
      return getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set heart_rate field
    * Units: bpm
    *
    * @param heartRate
    */
   public void setHeartRate(Short heartRate) {
      setFieldValue(3, 0, heartRate, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cadence field
    * Units: rpm
    *
    * @return cadence
    */
   public Short getCadence() {
      return getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cadence field
    * Units: rpm
    *
    * @param cadence
    */
   public void setCadence(Short cadence) {
      setFieldValue(4, 0, cadence, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get distance field
    * Units: m
    *
    * @return distance
    */
   public Float getDistance() {
      return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set distance field
    * Units: m
    *
    * @param distance
    */
   public void setDistance(Float distance) {
      setFieldValue(5, 0, distance, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get speed field
    * Units: m/s
    *
    * @return speed
    */
   public Float getSpeed() {
      return getFieldFloatValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set speed field
    * Units: m/s
    *
    * @param speed
    */
   public void setSpeed(Float speed) {
      setFieldValue(6, 0, speed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get power field
    * Units: watts
    *
    * @return power
    */
   public Integer getPower() {
      return getFieldIntegerValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set power field
    * Units: watts
    *
    * @param power
    */
   public void setPower(Integer power) {
      setFieldValue(7, 0, power, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of compressed_speed_distance
    */
   public int getNumCompressedSpeedDistance() {
      return getNumFieldValues(8, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get compressed_speed_distance field
    *
    * @param index of compressed_speed_distance
    * @return compressed_speed_distance
    */
   public Byte getCompressedSpeedDistance(int index) {
      return getFieldByteValue(8, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set compressed_speed_distance field
    *
    * @param index of compressed_speed_distance
    * @param compressedSpeedDistance
    */
   public void setCompressedSpeedDistance(int index, Byte compressedSpeedDistance) {
      setFieldValue(8, index, compressedSpeedDistance, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get grade field
    * Units: %
    *
    * @return grade
    */
   public Float getGrade() {
      return getFieldFloatValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set grade field
    * Units: %
    *
    * @param grade
    */
   public void setGrade(Float grade) {
      setFieldValue(9, 0, grade, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get resistance field
    * Comment: Relative. 0 is none  254 is Max.
    *
    * @return resistance
    */
   public Short getResistance() {
      return getFieldShortValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set resistance field
    * Comment: Relative. 0 is none  254 is Max.
    *
    * @param resistance
    */
   public void setResistance(Short resistance) {
      setFieldValue(10, 0, resistance, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get time_from_course field
    * Units: s
    *
    * @return time_from_course
    */
   public Float getTimeFromCourse() {
      return getFieldFloatValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set time_from_course field
    * Units: s
    *
    * @param timeFromCourse
    */
   public void setTimeFromCourse(Float timeFromCourse) {
      setFieldValue(11, 0, timeFromCourse, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cycle_length field
    * Units: m
    *
    * @return cycle_length
    */
   public Float getCycleLength() {
      return getFieldFloatValue(12, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cycle_length field
    * Units: m
    *
    * @param cycleLength
    */
   public void setCycleLength(Float cycleLength) {
      setFieldValue(12, 0, cycleLength, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get temperature field
    * Units: C
    *
    * @return temperature
    */
   public Byte getTemperature() {
      return getFieldByteValue(13, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set temperature field
    * Units: C
    *
    * @param temperature
    */
   public void setTemperature(Byte temperature) {
      setFieldValue(13, 0, temperature, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of speed_1s
    */
   public int getNumSpeed1s() {
      return getNumFieldValues(17, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get speed_1s field
    * Units: m/s
    * Comment: Speed at 1s intervals.  Timestamp field indicates time of last array element.
    *
    * @param index of speed_1s
    * @return speed_1s
    */
   public Float getSpeed1s(int index) {
      return getFieldFloatValue(17, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set speed_1s field
    * Units: m/s
    * Comment: Speed at 1s intervals.  Timestamp field indicates time of last array element.
    *
    * @param index of speed_1s
    * @param speed1s
    */
   public void setSpeed1s(int index, Float speed1s) {
      setFieldValue(17, index, speed1s, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cycles field
    * Units: cycles
    *
    * @return cycles
    */
   public Short getCycles() {
      return getFieldShortValue(18, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cycles field
    * Units: cycles
    *
    * @param cycles
    */
   public void setCycles(Short cycles) {
      setFieldValue(18, 0, cycles, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get total_cycles field
    * Units: cycles
    *
    * @return total_cycles
    */
   public Long getTotalCycles() {
      return getFieldLongValue(19, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set total_cycles field
    * Units: cycles
    *
    * @param totalCycles
    */
   public void setTotalCycles(Long totalCycles) {
      setFieldValue(19, 0, totalCycles, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get compressed_accumulated_power field
    * Units: watts
    *
    * @return compressed_accumulated_power
    */
   public Integer getCompressedAccumulatedPower() {
      return getFieldIntegerValue(28, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set compressed_accumulated_power field
    * Units: watts
    *
    * @param compressedAccumulatedPower
    */
   public void setCompressedAccumulatedPower(Integer compressedAccumulatedPower) {
      setFieldValue(28, 0, compressedAccumulatedPower, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get accumulated_power field
    * Units: watts
    *
    * @return accumulated_power
    */
   public Long getAccumulatedPower() {
      return getFieldLongValue(29, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set accumulated_power field
    * Units: watts
    *
    * @param accumulatedPower
    */
   public void setAccumulatedPower(Long accumulatedPower) {
      setFieldValue(29, 0, accumulatedPower, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_right_balance field
    *
    * @return left_right_balance
    */
   public Short getLeftRightBalance() {
      return getFieldShortValue(30, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_right_balance field
    *
    * @param leftRightBalance
    */
   public void setLeftRightBalance(Short leftRightBalance) {
      setFieldValue(30, 0, leftRightBalance, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get gps_accuracy field
    * Units: m
    *
    * @return gps_accuracy
    */
   public Short getGpsAccuracy() {
      return getFieldShortValue(31, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set gps_accuracy field
    * Units: m
    *
    * @param gpsAccuracy
    */
   public void setGpsAccuracy(Short gpsAccuracy) {
      setFieldValue(31, 0, gpsAccuracy, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get vertical_speed field
    * Units: m/s
    *
    * @return vertical_speed
    */
   public Float getVerticalSpeed() {
      return getFieldFloatValue(32, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set vertical_speed field
    * Units: m/s
    *
    * @param verticalSpeed
    */
   public void setVerticalSpeed(Float verticalSpeed) {
      setFieldValue(32, 0, verticalSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get calories field
    * Units: kcal
    *
    * @return calories
    */
   public Integer getCalories() {
      return getFieldIntegerValue(33, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set calories field
    * Units: kcal
    *
    * @param calories
    */
   public void setCalories(Integer calories) {
      setFieldValue(33, 0, calories, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get vertical_oscillation field
    * Units: mm
    *
    * @return vertical_oscillation
    */
   public Float getVerticalOscillation() {
      return getFieldFloatValue(39, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set vertical_oscillation field
    * Units: mm
    *
    * @param verticalOscillation
    */
   public void setVerticalOscillation(Float verticalOscillation) {
      setFieldValue(39, 0, verticalOscillation, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get stance_time_percent field
    * Units: percent
    *
    * @return stance_time_percent
    */
   public Float getStanceTimePercent() {
      return getFieldFloatValue(40, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set stance_time_percent field
    * Units: percent
    *
    * @param stanceTimePercent
    */
   public void setStanceTimePercent(Float stanceTimePercent) {
      setFieldValue(40, 0, stanceTimePercent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get stance_time field
    * Units: ms
    *
    * @return stance_time
    */
   public Float getStanceTime() {
      return getFieldFloatValue(41, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set stance_time field
    * Units: ms
    *
    * @param stanceTime
    */
   public void setStanceTime(Float stanceTime) {
      setFieldValue(41, 0, stanceTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get activity_type field
    *
    * @return activity_type
    */
   public ActivityType getActivityType() {
      Short value = getFieldShortValue(42, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return ActivityType.getByValue(value);
   }

   /**
    * Set activity_type field
    *
    * @param activityType
    */
   public void setActivityType(ActivityType activityType) {
      setFieldValue(42, 0, activityType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_torque_effectiveness field
    * Units: percent
    *
    * @return left_torque_effectiveness
    */
   public Float getLeftTorqueEffectiveness() {
      return getFieldFloatValue(43, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_torque_effectiveness field
    * Units: percent
    *
    * @param leftTorqueEffectiveness
    */
   public void setLeftTorqueEffectiveness(Float leftTorqueEffectiveness) {
      setFieldValue(43, 0, leftTorqueEffectiveness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get right_torque_effectiveness field
    * Units: percent
    *
    * @return right_torque_effectiveness
    */
   public Float getRightTorqueEffectiveness() {
      return getFieldFloatValue(44, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set right_torque_effectiveness field
    * Units: percent
    *
    * @param rightTorqueEffectiveness
    */
   public void setRightTorqueEffectiveness(Float rightTorqueEffectiveness) {
      setFieldValue(44, 0, rightTorqueEffectiveness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_pedal_smoothness field
    * Units: percent
    *
    * @return left_pedal_smoothness
    */
   public Float getLeftPedalSmoothness() {
      return getFieldFloatValue(45, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_pedal_smoothness field
    * Units: percent
    *
    * @param leftPedalSmoothness
    */
   public void setLeftPedalSmoothness(Float leftPedalSmoothness) {
      setFieldValue(45, 0, leftPedalSmoothness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get right_pedal_smoothness field
    * Units: percent
    *
    * @return right_pedal_smoothness
    */
   public Float getRightPedalSmoothness() {
      return getFieldFloatValue(46, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set right_pedal_smoothness field
    * Units: percent
    *
    * @param rightPedalSmoothness
    */
   public void setRightPedalSmoothness(Float rightPedalSmoothness) {
      setFieldValue(46, 0, rightPedalSmoothness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get combined_pedal_smoothness field
    * Units: percent
    *
    * @return combined_pedal_smoothness
    */
   public Float getCombinedPedalSmoothness() {
      return getFieldFloatValue(47, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set combined_pedal_smoothness field
    * Units: percent
    *
    * @param combinedPedalSmoothness
    */
   public void setCombinedPedalSmoothness(Float combinedPedalSmoothness) {
      setFieldValue(47, 0, combinedPedalSmoothness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get time128 field
    * Units: s
    *
    * @return time128
    */
   public Float getTime128() {
      return getFieldFloatValue(48, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set time128 field
    * Units: s
    *
    * @param time128
    */
   public void setTime128(Float time128) {
      setFieldValue(48, 0, time128, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get stroke_type field
    *
    * @return stroke_type
    */
   public StrokeType getStrokeType() {
      Short value = getFieldShortValue(49, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return StrokeType.getByValue(value);
   }

   /**
    * Set stroke_type field
    *
    * @param strokeType
    */
   public void setStrokeType(StrokeType strokeType) {
      setFieldValue(49, 0, strokeType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get zone field
    *
    * @return zone
    */
   public Short getZone() {
      return getFieldShortValue(50, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set zone field
    *
    * @param zone
    */
   public void setZone(Short zone) {
      setFieldValue(50, 0, zone, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get ball_speed field
    * Units: m/s
    *
    * @return ball_speed
    */
   public Float getBallSpeed() {
      return getFieldFloatValue(51, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set ball_speed field
    * Units: m/s
    *
    * @param ballSpeed
    */
   public void setBallSpeed(Float ballSpeed) {
      setFieldValue(51, 0, ballSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cadence256 field
    * Units: rpm
    * Comment: Log cadence and fractional cadence for backwards compatability
    *
    * @return cadence256
    */
   public Float getCadence256() {
      return getFieldFloatValue(52, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cadence256 field
    * Units: rpm
    * Comment: Log cadence and fractional cadence for backwards compatability
    *
    * @param cadence256
    */
   public void setCadence256(Float cadence256) {
      setFieldValue(52, 0, cadence256, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get fractional_cadence field
    * Units: rpm
    *
    * @return fractional_cadence
    */
   public Float getFractionalCadence() {
      return getFieldFloatValue(53, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set fractional_cadence field
    * Units: rpm
    *
    * @param fractionalCadence
    */
   public void setFractionalCadence(Float fractionalCadence) {
      setFieldValue(53, 0, fractionalCadence, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get total_hemoglobin_conc field
    * Units: g/dL
    * Comment: Total saturated and unsaturated hemoglobin
    *
    * @return total_hemoglobin_conc
    */
   public Float getTotalHemoglobinConc() {
      return getFieldFloatValue(54, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set total_hemoglobin_conc field
    * Units: g/dL
    * Comment: Total saturated and unsaturated hemoglobin
    *
    * @param totalHemoglobinConc
    */
   public void setTotalHemoglobinConc(Float totalHemoglobinConc) {
      setFieldValue(54, 0, totalHemoglobinConc, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get total_hemoglobin_conc_min field
    * Units: g/dL
    * Comment: Min saturated and unsaturated hemoglobin
    *
    * @return total_hemoglobin_conc_min
    */
   public Float getTotalHemoglobinConcMin() {
      return getFieldFloatValue(55, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set total_hemoglobin_conc_min field
    * Units: g/dL
    * Comment: Min saturated and unsaturated hemoglobin
    *
    * @param totalHemoglobinConcMin
    */
   public void setTotalHemoglobinConcMin(Float totalHemoglobinConcMin) {
      setFieldValue(55, 0, totalHemoglobinConcMin, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get total_hemoglobin_conc_max field
    * Units: g/dL
    * Comment: Max saturated and unsaturated hemoglobin
    *
    * @return total_hemoglobin_conc_max
    */
   public Float getTotalHemoglobinConcMax() {
      return getFieldFloatValue(56, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set total_hemoglobin_conc_max field
    * Units: g/dL
    * Comment: Max saturated and unsaturated hemoglobin
    *
    * @param totalHemoglobinConcMax
    */
   public void setTotalHemoglobinConcMax(Float totalHemoglobinConcMax) {
      setFieldValue(56, 0, totalHemoglobinConcMax, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get saturated_hemoglobin_percent field
    * Units: %
    * Comment: Percentage of hemoglobin saturated with oxygen
    *
    * @return saturated_hemoglobin_percent
    */
   public Float getSaturatedHemoglobinPercent() {
      return getFieldFloatValue(57, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set saturated_hemoglobin_percent field
    * Units: %
    * Comment: Percentage of hemoglobin saturated with oxygen
    *
    * @param saturatedHemoglobinPercent
    */
   public void setSaturatedHemoglobinPercent(Float saturatedHemoglobinPercent) {
      setFieldValue(57, 0, saturatedHemoglobinPercent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get saturated_hemoglobin_percent_min field
    * Units: %
    * Comment: Min percentage of hemoglobin saturated with oxygen
    *
    * @return saturated_hemoglobin_percent_min
    */
   public Float getSaturatedHemoglobinPercentMin() {
      return getFieldFloatValue(58, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set saturated_hemoglobin_percent_min field
    * Units: %
    * Comment: Min percentage of hemoglobin saturated with oxygen
    *
    * @param saturatedHemoglobinPercentMin
    */
   public void setSaturatedHemoglobinPercentMin(Float saturatedHemoglobinPercentMin) {
      setFieldValue(58, 0, saturatedHemoglobinPercentMin, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get saturated_hemoglobin_percent_max field
    * Units: %
    * Comment: Max percentage of hemoglobin saturated with oxygen
    *
    * @return saturated_hemoglobin_percent_max
    */
   public Float getSaturatedHemoglobinPercentMax() {
      return getFieldFloatValue(59, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set saturated_hemoglobin_percent_max field
    * Units: %
    * Comment: Max percentage of hemoglobin saturated with oxygen
    *
    * @param saturatedHemoglobinPercentMax
    */
   public void setSaturatedHemoglobinPercentMax(Float saturatedHemoglobinPercentMax) {
      setFieldValue(59, 0, saturatedHemoglobinPercentMax, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get device_index field
    *
    * @return device_index
    */
   public Short getDeviceIndex() {
      return getFieldShortValue(62, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set device_index field
    *
    * @param deviceIndex
    */
   public void setDeviceIndex(Short deviceIndex) {
      setFieldValue(62, 0, deviceIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_pco field
    * Units: mm
    * Comment: Left platform center offset
    *
    * @return left_pco
    */
   public Byte getLeftPco() {
      return getFieldByteValue(67, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_pco field
    * Units: mm
    * Comment: Left platform center offset
    *
    * @param leftPco
    */
   public void setLeftPco(Byte leftPco) {
      setFieldValue(67, 0, leftPco, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get right_pco field
    * Units: mm
    * Comment: Right platform center offset
    *
    * @return right_pco
    */
   public Byte getRightPco() {
      return getFieldByteValue(68, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set right_pco field
    * Units: mm
    * Comment: Right platform center offset
    *
    * @param rightPco
    */
   public void setRightPco(Byte rightPco) {
      setFieldValue(68, 0, rightPco, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of left_power_phase
    */
   public int getNumLeftPowerPhase() {
      return getNumFieldValues(69, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_power_phase field
    * Units: degrees
    * Comment: Left power phase angles. Data value indexes defined by power_phase_type.
    *
    * @param index of left_power_phase
    * @return left_power_phase
    */
   public Float getLeftPowerPhase(int index) {
      return getFieldFloatValue(69, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_power_phase field
    * Units: degrees
    * Comment: Left power phase angles. Data value indexes defined by power_phase_type.
    *
    * @param index of left_power_phase
    * @param leftPowerPhase
    */
   public void setLeftPowerPhase(int index, Float leftPowerPhase) {
      setFieldValue(69, index, leftPowerPhase, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of left_power_phase_peak
    */
   public int getNumLeftPowerPhasePeak() {
      return getNumFieldValues(70, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get left_power_phase_peak field
    * Units: degrees
    * Comment: Left power phase peak angles. Data value indexes defined by power_phase_type.
    *
    * @param index of left_power_phase_peak
    * @return left_power_phase_peak
    */
   public Float getLeftPowerPhasePeak(int index) {
      return getFieldFloatValue(70, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set left_power_phase_peak field
    * Units: degrees
    * Comment: Left power phase peak angles. Data value indexes defined by power_phase_type.
    *
    * @param index of left_power_phase_peak
    * @param leftPowerPhasePeak
    */
   public void setLeftPowerPhasePeak(int index, Float leftPowerPhasePeak) {
      setFieldValue(70, index, leftPowerPhasePeak, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of right_power_phase
    */
   public int getNumRightPowerPhase() {
      return getNumFieldValues(71, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get right_power_phase field
    * Units: degrees
    * Comment: Right power phase angles. Data value indexes defined by power_phase_type.
    *
    * @param index of right_power_phase
    * @return right_power_phase
    */
   public Float getRightPowerPhase(int index) {
      return getFieldFloatValue(71, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set right_power_phase field
    * Units: degrees
    * Comment: Right power phase angles. Data value indexes defined by power_phase_type.
    *
    * @param index of right_power_phase
    * @param rightPowerPhase
    */
   public void setRightPowerPhase(int index, Float rightPowerPhase) {
      setFieldValue(71, index, rightPowerPhase, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of right_power_phase_peak
    */
   public int getNumRightPowerPhasePeak() {
      return getNumFieldValues(72, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get right_power_phase_peak field
    * Units: degrees
    * Comment: Right power phase peak angles. Data value indexes defined by power_phase_type.
    *
    * @param index of right_power_phase_peak
    * @return right_power_phase_peak
    */
   public Float getRightPowerPhasePeak(int index) {
      return getFieldFloatValue(72, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set right_power_phase_peak field
    * Units: degrees
    * Comment: Right power phase peak angles. Data value indexes defined by power_phase_type.
    *
    * @param index of right_power_phase_peak
    * @param rightPowerPhasePeak
    */
   public void setRightPowerPhasePeak(int index, Float rightPowerPhasePeak) {
      setFieldValue(72, index, rightPowerPhasePeak, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get enhanced_speed field
    * Units: m/s
    *
    * @return enhanced_speed
    */
   public Float getEnhancedSpeed() {
      return getFieldFloatValue(73, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set enhanced_speed field
    * Units: m/s
    *
    * @param enhancedSpeed
    */
   public void setEnhancedSpeed(Float enhancedSpeed) {
      setFieldValue(73, 0, enhancedSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get enhanced_altitude field
    * Units: m
    *
    * @return enhanced_altitude
    */
   public Float getEnhancedAltitude() {
      return getFieldFloatValue(78, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set enhanced_altitude field
    * Units: m
    *
    * @param enhancedAltitude
    */
   public void setEnhancedAltitude(Float enhancedAltitude) {
      setFieldValue(78, 0, enhancedAltitude, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get battery_soc field
    * Units: percent
    * Comment: lev battery state of charge
    *
    * @return battery_soc
    */
   public Float getBatterySoc() {
      return getFieldFloatValue(81, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set battery_soc field
    * Units: percent
    * Comment: lev battery state of charge
    *
    * @param batterySoc
    */
   public void setBatterySoc(Float batterySoc) {
      setFieldValue(81, 0, batterySoc, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get motor_power field
    * Units: watts
    * Comment: lev motor power
    *
    * @return motor_power
    */
   public Integer getMotorPower() {
      return getFieldIntegerValue(82, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set motor_power field
    * Units: watts
    * Comment: lev motor power
    *
    * @param motorPower
    */
   public void setMotorPower(Integer motorPower) {
      setFieldValue(82, 0, motorPower, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}
