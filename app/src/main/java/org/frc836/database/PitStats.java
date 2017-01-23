/*
-----------------------------------------------------
StatsStructGen.py 1.0

This file was autogenerated with run cmd:
  "gen_scripts/StatsStructGen.py --packagename=org.frc836.database --classname=PitStats --tablename=scout_pit_data_2017 --infile=FRC_Scouting_Server/scouting.sql --outfile=app/src/main/java/org/frc836/database/PitStats.java"

python version info:
  3.4.2 (default, Oct  8 2014, 10:45:20) 
[GCC 4.9.1]

Please take heed of modifying unnecessarily
-----------------------------------------------------
*/

package org.frc836.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.frc836.database.DB;
import org.frc836.database.FRCScoutingContract.SCOUT_PIT_DATA_2017_Entry;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PitStats {


	public int team_id;
	public boolean can_score_high;
	public boolean can_score_low;
	public boolean can_score_gears;
	public boolean can_climb;
	public boolean ground_load_fuel;
	public boolean hopper_load_fuel;
	public boolean station_load_fuel;
	public boolean ground_load_gear;
	public boolean station_load_gear;
	public boolean custom_rope;
	public int auto_score_high_count;
	public int auto_score_low_count;
	public boolean auto_gear;
	public boolean auto_hopper;
	public int tele_score_high_count;
	public int tele_score_low_count;
	public int accuracy;
	public int hopper_capacity;
	public int scoring_speed_bps;
	public int loading_speed_bps;
	public int max_robot_speed_fts;
	public String config_id;
	public String wheel_base_id;
	public String wheel_type_id;
	public String notes;
	

	public static final String TABLE_NAME = SCOUT_PIT_DATA_2017_Entry.TABLE_NAME;
	public static final String COLUMN_NAME_ID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_ID;
	public static final String COLUMN_NAME_TEAM_ID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_TEAM_ID;
	public static final String COLUMN_NAME_CAN_SCORE_HIGH = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CAN_SCORE_HIGH;
	public static final String COLUMN_NAME_CAN_SCORE_LOW = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CAN_SCORE_LOW;
	public static final String COLUMN_NAME_CAN_SCORE_GEARS = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CAN_SCORE_GEARS;
	public static final String COLUMN_NAME_CAN_CLIMB = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CAN_CLIMB;
	public static final String COLUMN_NAME_GROUND_LOAD_FUEL = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_GROUND_LOAD_FUEL;
	public static final String COLUMN_NAME_HOPPER_LOAD_FUEL = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_HOPPER_LOAD_FUEL;
	public static final String COLUMN_NAME_STATION_LOAD_FUEL = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_STATION_LOAD_FUEL;
	public static final String COLUMN_NAME_GROUND_LOAD_GEAR = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_GROUND_LOAD_GEAR;
	public static final String COLUMN_NAME_STATION_LOAD_GEAR = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_STATION_LOAD_GEAR;
	public static final String COLUMN_NAME_CUSTOM_ROPE = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CUSTOM_ROPE;
	public static final String COLUMN_NAME_AUTO_SCORE_HIGH_COUNT = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_AUTO_SCORE_HIGH_COUNT;
	public static final String COLUMN_NAME_AUTO_SCORE_LOW_COUNT = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_AUTO_SCORE_LOW_COUNT;
	public static final String COLUMN_NAME_AUTO_GEAR = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_AUTO_GEAR;
	public static final String COLUMN_NAME_AUTO_HOPPER = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_AUTO_HOPPER;
	public static final String COLUMN_NAME_TELE_SCORE_HIGH_COUNT = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_TELE_SCORE_HIGH_COUNT;
	public static final String COLUMN_NAME_TELE_SCORE_LOW_COUNT = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_TELE_SCORE_LOW_COUNT;
	public static final String COLUMN_NAME_ACCURACY = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_ACCURACY;
	public static final String COLUMN_NAME_HOPPER_CAPACITY = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_HOPPER_CAPACITY;
	public static final String COLUMN_NAME_SCORING_SPEED_BPS = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_SCORING_SPEED_BPS;
	public static final String COLUMN_NAME_LOADING_SPEED_BPS = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_LOADING_SPEED_BPS;
	public static final String COLUMN_NAME_MAX_ROBOT_SPEED_FTS = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_MAX_ROBOT_SPEED_FTS;
	public static final String COLUMN_NAME_CONFIG_ID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_CONFIG_ID;
	public static final String COLUMN_NAME_WHEEL_BASE_ID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_WHEEL_BASE_ID;
	public static final String COLUMN_NAME_WHEEL_TYPE_ID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_WHEEL_TYPE_ID;
	public static final String COLUMN_NAME_NOTES = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_NOTES;
	public static final String COLUMN_NAME_INVALID = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_INVALID;
	public static final String COLUMN_NAME_TIMESTAMP = SCOUT_PIT_DATA_2017_Entry.COLUMN_NAME_TIMESTAMP;
	

	public PitStats() {
		init();
	}
	
	public void init() {
		team_id = 0;
		can_score_high = false;
		can_score_low = false;
		can_score_gears = false;
		can_climb = false;
		ground_load_fuel = false;
		hopper_load_fuel = false;
		station_load_fuel = false;
		ground_load_gear = false;
		station_load_gear = false;
		custom_rope = false;
		auto_score_high_count = 0;
		auto_score_low_count = 0;
		auto_gear = false;
		auto_hopper = false;
		tele_score_high_count = 0;
		tele_score_low_count = 0;
		accuracy = 0;
		hopper_capacity = 0;
		scoring_speed_bps = 0;
		loading_speed_bps = 0;
		max_robot_speed_fts = 0;
		config_id = "other";
		wheel_base_id = "other";
		wheel_type_id = "other";
		notes = "";
	}
	

	public ContentValues getValues(DB db, SQLiteDatabase database) {
		ContentValues vals = new ContentValues();
		vals.put(COLUMN_NAME_ID, team_id * team_id);
		vals.put(COLUMN_NAME_TEAM_ID, team_id);
		vals.put(COLUMN_NAME_CAN_SCORE_HIGH, can_score_high ? 1 : 0);
		vals.put(COLUMN_NAME_CAN_SCORE_LOW, can_score_low ? 1 : 0);
		vals.put(COLUMN_NAME_CAN_SCORE_GEARS, can_score_gears ? 1 : 0);
		vals.put(COLUMN_NAME_CAN_CLIMB, can_climb ? 1 : 0);
		vals.put(COLUMN_NAME_GROUND_LOAD_FUEL, ground_load_fuel ? 1 : 0);
		vals.put(COLUMN_NAME_HOPPER_LOAD_FUEL, hopper_load_fuel ? 1 : 0);
		vals.put(COLUMN_NAME_STATION_LOAD_FUEL, station_load_fuel ? 1 : 0);
		vals.put(COLUMN_NAME_GROUND_LOAD_GEAR, ground_load_gear ? 1 : 0);
		vals.put(COLUMN_NAME_STATION_LOAD_GEAR, station_load_gear ? 1 : 0);
		vals.put(COLUMN_NAME_CUSTOM_ROPE, custom_rope ? 1 : 0);
		vals.put(COLUMN_NAME_AUTO_SCORE_HIGH_COUNT, auto_score_high_count);
		vals.put(COLUMN_NAME_AUTO_SCORE_LOW_COUNT, auto_score_low_count);
		vals.put(COLUMN_NAME_AUTO_GEAR, auto_gear ? 1 : 0);
		vals.put(COLUMN_NAME_AUTO_HOPPER, auto_hopper ? 1 : 0);
		vals.put(COLUMN_NAME_TELE_SCORE_HIGH_COUNT, tele_score_high_count);
		vals.put(COLUMN_NAME_TELE_SCORE_LOW_COUNT, tele_score_low_count);
		vals.put(COLUMN_NAME_ACCURACY, accuracy);
		vals.put(COLUMN_NAME_HOPPER_CAPACITY, hopper_capacity);
		vals.put(COLUMN_NAME_SCORING_SPEED_BPS, scoring_speed_bps);
		vals.put(COLUMN_NAME_LOADING_SPEED_BPS, loading_speed_bps);
		vals.put(COLUMN_NAME_MAX_ROBOT_SPEED_FTS, max_robot_speed_fts);
		vals.put(COLUMN_NAME_CONFIG_ID, db.getConfigIDFromName(config_id, database));
		vals.put(COLUMN_NAME_WHEEL_BASE_ID, db.getWheelBaseIDFromName(wheel_base_id, database));
		vals.put(COLUMN_NAME_WHEEL_TYPE_ID, db.getWheelTypeIDFromName(wheel_type_id, database));
		vals.put(COLUMN_NAME_NOTES, notes);
		vals.put(COLUMN_NAME_INVALID, 1);
	
		return vals;
	}

	public void fromCursor(Cursor c, DB db, SQLiteDatabase database) {
		c.moveToFirst();
		team_id = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TEAM_ID));
		can_score_high = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CAN_SCORE_HIGH)) != 0;
		can_score_low = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CAN_SCORE_LOW)) != 0;
		can_score_gears = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CAN_SCORE_GEARS)) != 0;
		can_climb = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CAN_CLIMB)) != 0;
		ground_load_fuel = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_GROUND_LOAD_FUEL)) != 0;
		hopper_load_fuel = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_HOPPER_LOAD_FUEL)) != 0;
		station_load_fuel = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_STATION_LOAD_FUEL)) != 0;
		ground_load_gear = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_GROUND_LOAD_GEAR)) != 0;
		station_load_gear = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_STATION_LOAD_GEAR)) != 0;
		custom_rope = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CUSTOM_ROPE)) != 0;
		auto_score_high_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SCORE_HIGH_COUNT));
		auto_score_low_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SCORE_LOW_COUNT));
		auto_gear = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_GEAR)) != 0;
		auto_hopper = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_HOPPER)) != 0;
		tele_score_high_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TELE_SCORE_HIGH_COUNT));
		tele_score_low_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TELE_SCORE_LOW_COUNT));
		accuracy = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_ACCURACY));
		hopper_capacity = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_HOPPER_CAPACITY));
		scoring_speed_bps = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SCORING_SPEED_BPS));
		loading_speed_bps = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_LOADING_SPEED_BPS));
		max_robot_speed_fts = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_MAX_ROBOT_SPEED_FTS));
		config_id = DB.getConfigNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CONFIG_ID)), database);
		wheel_base_id = DB.getWheelBaseNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_WHEEL_BASE_ID)), database);
		wheel_type_id = DB.getWheelTypeNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_WHEEL_TYPE_ID)), database);
		notes = c.getString(c.getColumnIndexOrThrow(COLUMN_NAME_NOTES));
	}

	public String[] getProjection() {
		List<String> temp = new ArrayList<String>(26);
		temp.add(COLUMN_NAME_TEAM_ID);
		temp.add(COLUMN_NAME_CAN_SCORE_HIGH);
		temp.add(COLUMN_NAME_CAN_SCORE_LOW);
		temp.add(COLUMN_NAME_CAN_SCORE_GEARS);
		temp.add(COLUMN_NAME_CAN_CLIMB);
		temp.add(COLUMN_NAME_GROUND_LOAD_FUEL);
		temp.add(COLUMN_NAME_HOPPER_LOAD_FUEL);
		temp.add(COLUMN_NAME_STATION_LOAD_FUEL);
		temp.add(COLUMN_NAME_GROUND_LOAD_GEAR);
		temp.add(COLUMN_NAME_STATION_LOAD_GEAR);
		temp.add(COLUMN_NAME_CUSTOM_ROPE);
		temp.add(COLUMN_NAME_AUTO_SCORE_HIGH_COUNT);
		temp.add(COLUMN_NAME_AUTO_SCORE_LOW_COUNT);
		temp.add(COLUMN_NAME_AUTO_GEAR);
		temp.add(COLUMN_NAME_AUTO_HOPPER);
		temp.add(COLUMN_NAME_TELE_SCORE_HIGH_COUNT);
		temp.add(COLUMN_NAME_TELE_SCORE_LOW_COUNT);
		temp.add(COLUMN_NAME_ACCURACY);
		temp.add(COLUMN_NAME_HOPPER_CAPACITY);
		temp.add(COLUMN_NAME_SCORING_SPEED_BPS);
		temp.add(COLUMN_NAME_LOADING_SPEED_BPS);
		temp.add(COLUMN_NAME_MAX_ROBOT_SPEED_FTS);
		temp.add(COLUMN_NAME_CONFIG_ID);
		temp.add(COLUMN_NAME_WHEEL_BASE_ID);
		temp.add(COLUMN_NAME_WHEEL_TYPE_ID);
		temp.add(COLUMN_NAME_NOTES);
		String[] projection = new String[temp.size()];
		return temp.toArray(projection);
	}

	public boolean isTextField(String column_name) {
		if (COLUMN_NAME_NOTES.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public boolean needsConvertedToText(String column_name) {
		if (COLUMN_NAME_CONFIG_ID.equalsIgnoreCase(column_name)) return true;
	
		if (COLUMN_NAME_WHEEL_BASE_ID.equalsIgnoreCase(column_name)) return true;
	
		if (COLUMN_NAME_WHEEL_TYPE_ID.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public ContentValues jsonToCV(JSONObject json) throws JSONException {
		ContentValues vals = new ContentValues();
		vals.put(COLUMN_NAME_ID, json.getInt(COLUMN_NAME_ID));
		vals.put(COLUMN_NAME_TEAM_ID, json.getInt(COLUMN_NAME_TEAM_ID));
		vals.put(COLUMN_NAME_CAN_SCORE_HIGH, json.getInt(COLUMN_NAME_CAN_SCORE_HIGH));
		vals.put(COLUMN_NAME_CAN_SCORE_LOW, json.getInt(COLUMN_NAME_CAN_SCORE_LOW));
		vals.put(COLUMN_NAME_CAN_SCORE_GEARS, json.getInt(COLUMN_NAME_CAN_SCORE_GEARS));
		vals.put(COLUMN_NAME_CAN_CLIMB, json.getInt(COLUMN_NAME_CAN_CLIMB));
		vals.put(COLUMN_NAME_GROUND_LOAD_FUEL, json.getInt(COLUMN_NAME_GROUND_LOAD_FUEL));
		vals.put(COLUMN_NAME_HOPPER_LOAD_FUEL, json.getInt(COLUMN_NAME_HOPPER_LOAD_FUEL));
		vals.put(COLUMN_NAME_STATION_LOAD_FUEL, json.getInt(COLUMN_NAME_STATION_LOAD_FUEL));
		vals.put(COLUMN_NAME_GROUND_LOAD_GEAR, json.getInt(COLUMN_NAME_GROUND_LOAD_GEAR));
		vals.put(COLUMN_NAME_STATION_LOAD_GEAR, json.getInt(COLUMN_NAME_STATION_LOAD_GEAR));
		vals.put(COLUMN_NAME_CUSTOM_ROPE, json.getInt(COLUMN_NAME_CUSTOM_ROPE));
		vals.put(COLUMN_NAME_AUTO_SCORE_HIGH_COUNT, json.getInt(COLUMN_NAME_AUTO_SCORE_HIGH_COUNT));
		vals.put(COLUMN_NAME_AUTO_SCORE_LOW_COUNT, json.getInt(COLUMN_NAME_AUTO_SCORE_LOW_COUNT));
		vals.put(COLUMN_NAME_AUTO_GEAR, json.getInt(COLUMN_NAME_AUTO_GEAR));
		vals.put(COLUMN_NAME_AUTO_HOPPER, json.getInt(COLUMN_NAME_AUTO_HOPPER));
		vals.put(COLUMN_NAME_TELE_SCORE_HIGH_COUNT, json.getInt(COLUMN_NAME_TELE_SCORE_HIGH_COUNT));
		vals.put(COLUMN_NAME_TELE_SCORE_LOW_COUNT, json.getInt(COLUMN_NAME_TELE_SCORE_LOW_COUNT));
		vals.put(COLUMN_NAME_ACCURACY, json.getInt(COLUMN_NAME_ACCURACY));
		vals.put(COLUMN_NAME_HOPPER_CAPACITY, json.getInt(COLUMN_NAME_HOPPER_CAPACITY));
		vals.put(COLUMN_NAME_SCORING_SPEED_BPS, json.getInt(COLUMN_NAME_SCORING_SPEED_BPS));
		vals.put(COLUMN_NAME_LOADING_SPEED_BPS, json.getInt(COLUMN_NAME_LOADING_SPEED_BPS));
		vals.put(COLUMN_NAME_MAX_ROBOT_SPEED_FTS, json.getInt(COLUMN_NAME_MAX_ROBOT_SPEED_FTS));
		vals.put(COLUMN_NAME_CONFIG_ID, json.getInt(COLUMN_NAME_CONFIG_ID));
		vals.put(COLUMN_NAME_WHEEL_BASE_ID, json.getInt(COLUMN_NAME_WHEEL_BASE_ID));
		vals.put(COLUMN_NAME_WHEEL_TYPE_ID, json.getInt(COLUMN_NAME_WHEEL_TYPE_ID));
		vals.put(COLUMN_NAME_NOTES, json.getString(COLUMN_NAME_NOTES));
		vals.put(COLUMN_NAME_INVALID, 0);
		vals.put(COLUMN_NAME_TIMESTAMP, DB.dateParser.format(new Date(json.getLong(COLUMN_NAME_TIMESTAMP) * 1000)));
		return vals;
	}

}