/*
-----------------------------------------------------
StatsStructGen.py 1.0

This file was autogenerated with run cmd:
  "gen_scripts/StatsStructGen.py --packagename=org.frc836.database --classname=MatchStatsStruct --tablename=fact_match_data_2017 --infile=FRC_Scouting_Server/scouting.sql --outfile=app/src/main/java/org/frc836/database/MatchStatsStruct.java"

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
import org.frc836.database.FRCScoutingContract.FACT_MATCH_DATA_2017_Entry;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchStatsStruct {


	public String event_id;
	public int team_id;
	public int match_id;
	public boolean practice_match;
	public String position_id;
	public int auto_score_low;
	public int auto_score_high;
	public int auto_miss_high;
	public boolean auto_cross_baseline;
	public int auto_gear_delivered_left;
	public int auto_gear_delivered_right;
	public int auto_gear_delivered_center;
	public boolean auto_dump_hopper;
	public int score_low;
	public int score_high;
	public int miss_high;
	public int gear_delivered_left;
	public int gear_delivered_right;
	public int gear_delivered_center;
	public boolean climb_rope;
	public boolean climb_attempt;
	public boolean foul;
	public boolean yellow_card;
	public boolean red_card;
	public boolean tip_over;
	public String notes;
	

	public static final String TABLE_NAME = FACT_MATCH_DATA_2017_Entry.TABLE_NAME;
	public static final String COLUMN_NAME_ID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_ID;
	public static final String COLUMN_NAME_EVENT_ID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_EVENT_ID;
	public static final String COLUMN_NAME_TEAM_ID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_TEAM_ID;
	public static final String COLUMN_NAME_MATCH_ID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_MATCH_ID;
	public static final String COLUMN_NAME_PRACTICE_MATCH = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_PRACTICE_MATCH;
	public static final String COLUMN_NAME_POSITION_ID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_POSITION_ID;
	public static final String COLUMN_NAME_AUTO_SCORE_LOW = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_SCORE_LOW;
	public static final String COLUMN_NAME_AUTO_SCORE_HIGH = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_SCORE_HIGH;
	public static final String COLUMN_NAME_AUTO_MISS_HIGH = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_MISS_HIGH;
	public static final String COLUMN_NAME_AUTO_CROSS_BASELINE = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_CROSS_BASELINE;
	public static final String COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT;
	public static final String COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT;
	public static final String COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER;
	public static final String COLUMN_NAME_AUTO_DUMP_HOPPER = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_AUTO_DUMP_HOPPER;
	public static final String COLUMN_NAME_SCORE_LOW = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_SCORE_LOW;
	public static final String COLUMN_NAME_SCORE_HIGH = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_SCORE_HIGH;
	public static final String COLUMN_NAME_MISS_HIGH = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_MISS_HIGH;
	public static final String COLUMN_NAME_GEAR_DELIVERED_LEFT = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_GEAR_DELIVERED_LEFT;
	public static final String COLUMN_NAME_GEAR_DELIVERED_RIGHT = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_GEAR_DELIVERED_RIGHT;
	public static final String COLUMN_NAME_GEAR_DELIVERED_CENTER = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_GEAR_DELIVERED_CENTER;
	public static final String COLUMN_NAME_CLIMB_ROPE = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_CLIMB_ROPE;
	public static final String COLUMN_NAME_CLIMB_ATTEMPT = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_CLIMB_ATTEMPT;
	public static final String COLUMN_NAME_FOUL = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_FOUL;
	public static final String COLUMN_NAME_YELLOW_CARD = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_YELLOW_CARD;
	public static final String COLUMN_NAME_RED_CARD = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_RED_CARD;
	public static final String COLUMN_NAME_TIP_OVER = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_TIP_OVER;
	public static final String COLUMN_NAME_NOTES = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_NOTES;
	public static final String COLUMN_NAME_INVALID = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_INVALID;
	public static final String COLUMN_NAME_TIMESTAMP = FACT_MATCH_DATA_2017_Entry.COLUMN_NAME_TIMESTAMP;
	

	public MatchStatsStruct() {
		init();
	}
	
	public void init() {
		event_id = "";
		team_id = 0;
		match_id = 0;
		practice_match = false;
		position_id = "Red 1";
		auto_score_low = 0;
		auto_score_high = 0;
		auto_miss_high = 0;
		auto_cross_baseline = false;
		auto_gear_delivered_left = 0;
		auto_gear_delivered_right = 0;
		auto_gear_delivered_center = 0;
		auto_dump_hopper = false;
		score_low = 0;
		score_high = 0;
		miss_high = 0;
		gear_delivered_left = 0;
		gear_delivered_right = 0;
		gear_delivered_center = 0;
		climb_rope = false;
		climb_attempt = false;
		foul = false;
		yellow_card = false;
		red_card = false;
		tip_over = false;
		notes = "";
	}
	
	public MatchStatsStruct(int team, String event, int match) {
		init();
		this.team_id = team;
		this.event_id = event;
		this.match_id = match;
	}
	
	public MatchStatsStruct(int team, String event, int match, boolean practice) {
		init();
		this.team_id = team;
		this.event_id = event;
		this.match_id = match;
		this.practice_match = practice;
	}

	public ContentValues getValues(DB db, SQLiteDatabase database) {
		ContentValues vals = new ContentValues();
		long ev = db.getEventIDFromName(event_id, database);
		vals.put(COLUMN_NAME_ID, ev * 10000000 + match_id * 10000 + team_id);
		vals.put(COLUMN_NAME_EVENT_ID, ev);
		vals.put(COLUMN_NAME_TEAM_ID, team_id);
		vals.put(COLUMN_NAME_MATCH_ID, match_id);
		vals.put(COLUMN_NAME_PRACTICE_MATCH, practice_match ? 1 : 0);
		vals.put(COLUMN_NAME_POSITION_ID, db.getPosIDFromName(position_id, database));
		vals.put(COLUMN_NAME_AUTO_SCORE_LOW, auto_score_low);
		vals.put(COLUMN_NAME_AUTO_SCORE_HIGH, auto_score_high);
		vals.put(COLUMN_NAME_AUTO_MISS_HIGH, auto_miss_high);
		vals.put(COLUMN_NAME_AUTO_CROSS_BASELINE, auto_cross_baseline ? 1 : 0);
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT, auto_gear_delivered_left);
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT, auto_gear_delivered_right);
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER, auto_gear_delivered_center);
		vals.put(COLUMN_NAME_AUTO_DUMP_HOPPER, auto_dump_hopper ? 1 : 0);
		vals.put(COLUMN_NAME_SCORE_LOW, score_low);
		vals.put(COLUMN_NAME_SCORE_HIGH, score_high);
		vals.put(COLUMN_NAME_MISS_HIGH, miss_high);
		vals.put(COLUMN_NAME_GEAR_DELIVERED_LEFT, gear_delivered_left);
		vals.put(COLUMN_NAME_GEAR_DELIVERED_RIGHT, gear_delivered_right);
		vals.put(COLUMN_NAME_GEAR_DELIVERED_CENTER, gear_delivered_center);
		vals.put(COLUMN_NAME_CLIMB_ROPE, climb_rope ? 1 : 0);
		vals.put(COLUMN_NAME_CLIMB_ATTEMPT, climb_attempt ? 1 : 0);
		vals.put(COLUMN_NAME_FOUL, foul ? 1 : 0);
		vals.put(COLUMN_NAME_YELLOW_CARD, yellow_card ? 1 : 0);
		vals.put(COLUMN_NAME_RED_CARD, red_card ? 1 : 0);
		vals.put(COLUMN_NAME_TIP_OVER, tip_over ? 1 : 0);
		vals.put(COLUMN_NAME_NOTES, notes);
		vals.put(COLUMN_NAME_INVALID, 1);
	
		return vals;
	}

	public void fromCursor(Cursor c, DB db, SQLiteDatabase database) {
		c.moveToFirst();
		event_id = DB.getEventNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_EVENT_ID)), database);
		team_id = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TEAM_ID));
		match_id = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_MATCH_ID));
		practice_match = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_PRACTICE_MATCH)) != 0;
		position_id = DB.getPosNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_POSITION_ID)), database);
		auto_score_low = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SCORE_LOW));
		auto_score_high = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SCORE_HIGH));
		auto_miss_high = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_MISS_HIGH));
		auto_cross_baseline = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_CROSS_BASELINE)) != 0;
		auto_gear_delivered_left = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT));
		auto_gear_delivered_right = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT));
		auto_gear_delivered_center = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER));
		auto_dump_hopper = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_DUMP_HOPPER)) != 0;
		score_low = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SCORE_LOW));
		score_high = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SCORE_HIGH));
		miss_high = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_MISS_HIGH));
		gear_delivered_left = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_GEAR_DELIVERED_LEFT));
		gear_delivered_right = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_GEAR_DELIVERED_RIGHT));
		gear_delivered_center = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_GEAR_DELIVERED_CENTER));
		climb_rope = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CLIMB_ROPE)) != 0;
		climb_attempt = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CLIMB_ATTEMPT)) != 0;
		foul = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_FOUL)) != 0;
		yellow_card = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_YELLOW_CARD)) != 0;
		red_card = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_RED_CARD)) != 0;
		tip_over = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TIP_OVER)) != 0;
		notes = c.getString(c.getColumnIndexOrThrow(COLUMN_NAME_NOTES));
	}

	public String[] getProjection() {
		List<String> temp = new ArrayList<String>(26);
		temp.add(COLUMN_NAME_EVENT_ID);
		temp.add(COLUMN_NAME_TEAM_ID);
		temp.add(COLUMN_NAME_MATCH_ID);
		temp.add(COLUMN_NAME_PRACTICE_MATCH);
		temp.add(COLUMN_NAME_POSITION_ID);
		temp.add(COLUMN_NAME_AUTO_SCORE_LOW);
		temp.add(COLUMN_NAME_AUTO_SCORE_HIGH);
		temp.add(COLUMN_NAME_AUTO_MISS_HIGH);
		temp.add(COLUMN_NAME_AUTO_CROSS_BASELINE);
		temp.add(COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT);
		temp.add(COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT);
		temp.add(COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER);
		temp.add(COLUMN_NAME_AUTO_DUMP_HOPPER);
		temp.add(COLUMN_NAME_SCORE_LOW);
		temp.add(COLUMN_NAME_SCORE_HIGH);
		temp.add(COLUMN_NAME_MISS_HIGH);
		temp.add(COLUMN_NAME_GEAR_DELIVERED_LEFT);
		temp.add(COLUMN_NAME_GEAR_DELIVERED_RIGHT);
		temp.add(COLUMN_NAME_GEAR_DELIVERED_CENTER);
		temp.add(COLUMN_NAME_CLIMB_ROPE);
		temp.add(COLUMN_NAME_CLIMB_ATTEMPT);
		temp.add(COLUMN_NAME_FOUL);
		temp.add(COLUMN_NAME_YELLOW_CARD);
		temp.add(COLUMN_NAME_RED_CARD);
		temp.add(COLUMN_NAME_TIP_OVER);
		temp.add(COLUMN_NAME_NOTES);
		String[] projection = new String[temp.size()];
		return temp.toArray(projection);
	}

	public boolean isTextField(String column_name) {
		if (COLUMN_NAME_NOTES.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public boolean needsConvertedToText(String column_name) {
		if (COLUMN_NAME_EVENT_ID.equalsIgnoreCase(column_name)) return true;
	
		if (COLUMN_NAME_POSITION_ID.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public ContentValues jsonToCV(JSONObject json) throws JSONException {
		ContentValues vals = new ContentValues();
		vals.put(COLUMN_NAME_ID, json.getInt(COLUMN_NAME_ID));
		vals.put(COLUMN_NAME_EVENT_ID, json.getInt(COLUMN_NAME_EVENT_ID));
		vals.put(COLUMN_NAME_TEAM_ID, json.getInt(COLUMN_NAME_TEAM_ID));
		vals.put(COLUMN_NAME_MATCH_ID, json.getInt(COLUMN_NAME_MATCH_ID));
		vals.put(COLUMN_NAME_PRACTICE_MATCH, json.getInt(COLUMN_NAME_PRACTICE_MATCH));
		vals.put(COLUMN_NAME_POSITION_ID, json.getInt(COLUMN_NAME_POSITION_ID));
		vals.put(COLUMN_NAME_AUTO_SCORE_LOW, json.getInt(COLUMN_NAME_AUTO_SCORE_LOW));
		vals.put(COLUMN_NAME_AUTO_SCORE_HIGH, json.getInt(COLUMN_NAME_AUTO_SCORE_HIGH));
		vals.put(COLUMN_NAME_AUTO_MISS_HIGH, json.getInt(COLUMN_NAME_AUTO_MISS_HIGH));
		vals.put(COLUMN_NAME_AUTO_CROSS_BASELINE, json.getInt(COLUMN_NAME_AUTO_CROSS_BASELINE));
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT, json.getInt(COLUMN_NAME_AUTO_GEAR_DELIVERED_LEFT));
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT, json.getInt(COLUMN_NAME_AUTO_GEAR_DELIVERED_RIGHT));
		vals.put(COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER, json.getInt(COLUMN_NAME_AUTO_GEAR_DELIVERED_CENTER));
		vals.put(COLUMN_NAME_AUTO_DUMP_HOPPER, json.getInt(COLUMN_NAME_AUTO_DUMP_HOPPER));
		vals.put(COLUMN_NAME_SCORE_LOW, json.getInt(COLUMN_NAME_SCORE_LOW));
		vals.put(COLUMN_NAME_SCORE_HIGH, json.getInt(COLUMN_NAME_SCORE_HIGH));
		vals.put(COLUMN_NAME_MISS_HIGH, json.getInt(COLUMN_NAME_MISS_HIGH));
		vals.put(COLUMN_NAME_GEAR_DELIVERED_LEFT, json.getInt(COLUMN_NAME_GEAR_DELIVERED_LEFT));
		vals.put(COLUMN_NAME_GEAR_DELIVERED_RIGHT, json.getInt(COLUMN_NAME_GEAR_DELIVERED_RIGHT));
		vals.put(COLUMN_NAME_GEAR_DELIVERED_CENTER, json.getInt(COLUMN_NAME_GEAR_DELIVERED_CENTER));
		vals.put(COLUMN_NAME_CLIMB_ROPE, json.getInt(COLUMN_NAME_CLIMB_ROPE));
		vals.put(COLUMN_NAME_CLIMB_ATTEMPT, json.getInt(COLUMN_NAME_CLIMB_ATTEMPT));
		vals.put(COLUMN_NAME_FOUL, json.getInt(COLUMN_NAME_FOUL));
		vals.put(COLUMN_NAME_YELLOW_CARD, json.getInt(COLUMN_NAME_YELLOW_CARD));
		vals.put(COLUMN_NAME_RED_CARD, json.getInt(COLUMN_NAME_RED_CARD));
		vals.put(COLUMN_NAME_TIP_OVER, json.getInt(COLUMN_NAME_TIP_OVER));
		vals.put(COLUMN_NAME_NOTES, json.getString(COLUMN_NAME_NOTES));
		vals.put(COLUMN_NAME_INVALID, 0);
		vals.put(COLUMN_NAME_TIMESTAMP, DB.dateParser.format(new Date(json.getLong(COLUMN_NAME_TIMESTAMP) * 1000)));
		return vals;
	}

}