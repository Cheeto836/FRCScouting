/*
-----------------------------------------------------
SQLITEContractGen.py 2.0

This file was autogenerated with run cmd:
  "SQLITEContractGen.py --packagename=org.frc836.database --classname=FRCScoutingContract --infile=FRC_Scouting_Server/scouting.sql --outfile=src/org/frc836/database/FRCScoutingContract.java"

python version info:
  2.7.3 (default, Dec 18 2014, 19:10:20) 
[GCC 4.6.3]

Please take heed of modifying unnecessarily
-----------------------------------------------------
*/

package org.frc836.database;

import android.provider.BaseColumns;

public final class FRCScoutingContract {
	public FRCScoutingContract() {};

	public static abstract class CONFIGURATION_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "configuration_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_CONFIGURATION_DESC = "configuration_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}
	
	public static abstract class EVENT_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "event_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_EVENT_NAME = "event_name";
		public static final String COLUMN_NAME_MATCH_URL = "match_url";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}
	
	public static abstract class FACT_MATCH_DATA_2015_Entry implements BaseColumns {
		public static final String TABLE_NAME = "fact_match_data_2015";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_EVENT_ID = "event_id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_MATCH_ID = "match_id";
		public static final String COLUMN_NAME_PRACTICE_MATCH = "practice_match";
		public static final String COLUMN_NAME_AUTO_MOVE = "auto_move";
		public static final String COLUMN_NAME_AUTO_TOTES = "auto_totes";
		public static final String COLUMN_NAME_AUTO_STACK_2 = "auto_stack_2";
		public static final String COLUMN_NAME_AUTO_STACK_3 = "auto_stack_3";
		public static final String COLUMN_NAME_AUTO_BIN = "auto_bin";
		public static final String COLUMN_NAME_AUTO_STEP_BIN = "auto_step_bin";
		public static final String COLUMN_NAME_TOTES_1 = "totes_1";
		public static final String COLUMN_NAME_TOTES_2 = "totes_2";
		public static final String COLUMN_NAME_TOTES_3 = "totes_3";
		public static final String COLUMN_NAME_TOTES_4 = "totes_4";
		public static final String COLUMN_NAME_TOTES_5 = "totes_5";
		public static final String COLUMN_NAME_TOTES_6 = "totes_6";
		public static final String COLUMN_NAME_COOP_1 = "coop_1";
		public static final String COLUMN_NAME_COOP_2 = "coop_2";
		public static final String COLUMN_NAME_COOP_3 = "coop_3";
		public static final String COLUMN_NAME_COOP_4 = "coop_4";
		public static final String COLUMN_NAME_BIN_1 = "bin_1";
		public static final String COLUMN_NAME_BIN_2 = "bin_2";
		public static final String COLUMN_NAME_BIN_3 = "bin_3";
		public static final String COLUMN_NAME_BIN_4 = "bin_4";
		public static final String COLUMN_NAME_BIN_5 = "bin_5";
		public static final String COLUMN_NAME_BIN_6 = "bin_6";
		public static final String COLUMN_NAME_BIN_LITTER = "bin_litter";
		public static final String COLUMN_NAME_LANDFILL_LITTER = "landfill_litter";
		public static final String COLUMN_NAME_FOUL = "foul";
		public static final String COLUMN_NAME_YELLOW_CARD = "yellow_card";
		public static final String COLUMN_NAME_RED_CARD = "red_card";
		public static final String COLUMN_NAME_TIP_OVER = "tip_over";
		public static final String COLUMN_NAME_NOTES = "notes";
		public static final String COLUMN_NAME_INVALID = "invalid";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
	}
	
	public static abstract class NOTES_OPTIONS_Entry implements BaseColumns {
		public static final String TABLE_NAME = "notes_options";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_OPTION_TEXT = "option_text";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}
	
	public static abstract class SCOUT_PIT_DATA_2015_Entry implements BaseColumns {
		public static final String TABLE_NAME = "scout_pit_data_2015";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TEAM_ID = "team_id";
		public static final String COLUMN_NAME_PUSH_TOTE = "push_tote";
		public static final String COLUMN_NAME_PUSH_BIN = "push_bin";
		public static final String COLUMN_NAME_LIFT_TOTE = "lift_tote";
		public static final String COLUMN_NAME_LIFT_BIN = "lift_bin";
		public static final String COLUMN_NAME_PUSH_LITTER = "push_litter";
		public static final String COLUMN_NAME_LOAD_LITTER = "load_litter";
		public static final String COLUMN_NAME_STACK_TOTE_HEIGHT = "stack_tote_height";
		public static final String COLUMN_NAME_STACK_BIN_HEIGHT = "stack_bin_height";
		public static final String COLUMN_NAME_COOP_TOTES = "coop_totes";
		public static final String COLUMN_NAME_COOP_STACK_HEIGHT = "coop_stack_height";
		public static final String COLUMN_NAME_MOVE_AUTO = "move_auto";
		public static final String COLUMN_NAME_AUTO_BIN_SCORE = "auto_bin_score";
		public static final String COLUMN_NAME_AUTO_TOTE_SCORE = "auto_tote_score";
		public static final String COLUMN_NAME_AUTO_TOTE_STACK_HEIGHT = "auto_tote_stack_height";
		public static final String COLUMN_NAME_AUTO_STEP_BINS = "auto_step_bins";
		public static final String COLUMN_NAME_CONFIG_ID = "config_id";
		public static final String COLUMN_NAME_WHEEL_BASE_ID = "wheel_base_id";
		public static final String COLUMN_NAME_WHEEL_TYPE_ID = "wheel_type_id";
		public static final String COLUMN_NAME_MANIP_STYLE = "manip_style";
		public static final String COLUMN_NAME_NEED_UPRIGHT_TOTE = "need_upright_tote";
		public static final String COLUMN_NAME_NEED_UPRIGHT_BIN = "need_upright_bin";
		public static final String COLUMN_NAME_CAN_UPRIGHT_TOTE = "can_upright_tote";
		public static final String COLUMN_NAME_CAN_UPRIGHT_BIN = "can_upright_bin";
		public static final String COLUMN_NAME_NOTES = "notes";
		public static final String COLUMN_NAME_INVALID = "invalid";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
	}
	
	public static abstract class WHEEL_BASE_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "wheel_base_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_WHEEL_BASE_DESC = "wheel_base_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}
	
	public static abstract class WHEEL_TYPE_LU_Entry implements BaseColumns {
		public static final String TABLE_NAME = "wheel_type_lu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_WHEEL_TYPE_DESC = "wheel_type_desc";
		public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
		public static final String COLUMN_NAME_INVALID = "invalid";
	}

	public static final String[] SQL_CREATE_ENTRIES = {
		"CREATE TABLE IF NOT EXISTS configuration_lu (\n" +
		"	id integer primary key autoincrement,\n" +
		"	configuration_desc text NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
		"	invalid unsigned tinyint(1) NOT NULL DEFAULT '0'\n" +
		");",
	
		"INSERT INTO configuration_lu\n" +
		"SELECT 1 AS id, 'Wide' AS configuration_desc, '2014-01-25 15:18:38' AS timestamp, 0 AS invalid\n" +
		"UNION SELECT 2, 'Long', '2014-01-25 15:18:38', 0\n" +
		"UNION SELECT 3, 'Square', '2014-01-25 15:18:38', 0\n" +
		"UNION SELECT 4, 'Round', '2014-01-25 15:18:38', 0\n" +
		"UNION SELECT 5, 'Hex', '2014-01-25 15:18:38', 0\n" +
		"UNION SELECT 6, 'Triangle', '2014-01-25 15:18:38', 0\n" +
		"UNION SELECT 7, 'Other', '2014-01-25 15:18:38', 0;",
	
		"CREATE TABLE IF NOT EXISTS event_lu (\n" +
		"	id integer primary key autoincrement,\n" +
		"	event_name text NOT NULL,\n" +
		"	match_url text NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
		"	invalid unsigned tinyint(1) NOT NULL DEFAULT '0'\n" +
		");",
	
		"CREATE TABLE IF NOT EXISTS fact_match_data_2015 (\n" +
		"	id integer primary key autoincrement,\n" +
		"	event_id unsigned int(4) NOT NULL,\n" +
		"	team_id unsigned int(5) NOT NULL,\n" +
		"	match_id unsigned int(4) NOT NULL,\n" +
		"	practice_match tinyint(1) NOT NULL DEFAULT '0',\n" +
		"	auto_move tinyint(1) NOT NULL,\n" +
		"	auto_totes unsigned int(2) NOT NULL,\n" +
		"	auto_stack_2 tinyint(1) NOT NULL,\n" +
		"	auto_stack_3 tinyint(1) NOT NULL,\n" +
		"	auto_bin unsigned int(2) NOT NULL,\n" +
		"	auto_step_bin unsigned int(2) NOT NULL,\n" +
		"	totes_1 unsigned int(3) NOT NULL,\n" +
		"	totes_2 unsigned int(3) NOT NULL,\n" +
		"	totes_3 unsigned int(3) NOT NULL,\n" +
		"	totes_4 unsigned int(3) NOT NULL,\n" +
		"	totes_5 unsigned int(3) NOT NULL,\n" +
		"	totes_6 unsigned int(3) NOT NULL,\n" +
		"	coop_1 unsigned int(2) NOT NULL,\n" +
		"	coop_2 unsigned int(2) NOT NULL,\n" +
		"	coop_3 unsigned int(2) NOT NULL,\n" +
		"	coop_4 unsigned int(2) NOT NULL,\n" +
		"	bin_1 unsigned int(3) NOT NULL,\n" +
		"	bin_2 unsigned int(3) NOT NULL,\n" +
		"	bin_3 unsigned int(3) NOT NULL,\n" +
		"	bin_4 unsigned int(3) NOT NULL,\n" +
		"	bin_5 unsigned int(3) NOT NULL,\n" +
		"	bin_6 unsigned int(3) NOT NULL,\n" +
		"	bin_litter unsigned int(3) NOT NULL,\n" +
		"	landfill_litter unsigned int(3) NOT NULL,\n" +
		"	foul tinyint(1) NOT NULL,\n" +
		"	yellow_card tinyint(1) NOT NULL,\n" +
		"	red_card tinyint(1) NOT NULL,\n" +
		"	tip_over tinyint(1) NOT NULL,\n" +
		"	notes text NOT NULL,\n" +
		"	invalid tinyint(1) NOT NULL DEFAULT '0',\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP\n" +
		");",
	
		"CREATE TABLE IF NOT EXISTS notes_options (\n" +
		"	id integer primary key autoincrement,\n" +
		"	option_text text NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
		"	invalid unsigned tinyint(1) NOT NULL DEFAULT '0'\n" +
		");",
	
		"INSERT INTO notes_options\n" +
		"SELECT 1 AS id, 'No Show' AS option_text, '2014-01-25 15:21:36' AS timestamp, 0 AS invalid\n" +
		"UNION SELECT 2, 'Non-functional', '2014-01-25 15:21:36', 0\n" +
		"UNION SELECT 4, 'Turned Bin upright', '2015-01-23 00:43:18', 0\n" +
		"UNION SELECT 3, 'Turned Tote upright', '2015-01-23 00:43:18', 0;",
	
		"CREATE TABLE IF NOT EXISTS scout_pit_data_2015 (\n" +
		"	id integer primary key autoincrement,\n" +
		"	team_id unsigned int(5) NOT NULL,\n" +
		"	push_tote tinyint(1) NOT NULL,\n" +
		"	push_bin tinyint(1) NOT NULL,\n" +
		"	lift_tote tinyint(1) NOT NULL,\n" +
		"	lift_bin tinyint(1) NOT NULL,\n" +
		"	push_litter tinyint(1) NOT NULL,\n" +
		"	load_litter tinyint(1) NOT NULL,\n" +
		"	stack_tote_height unsigned int(2) NOT NULL,\n" +
		"	stack_bin_height unsigned int(2) NOT NULL,\n" +
		"	coop_totes unsigned int(2) NOT NULL,\n" +
		"	coop_stack_height unsigned int(2) NOT NULL,\n" +
		"	move_auto tinyint(1) NOT NULL,\n" +
		"	auto_bin_score unsigned int(2) NOT NULL,\n" +
		"	auto_tote_score unsigned int(2) NOT NULL,\n" +
		"	auto_tote_stack_height unsigned int(2) NOT NULL,\n" +
		"	auto_step_bins unsigned int(2) NOT NULL,\n" +
		"	config_id unsigned int(3) NOT NULL,\n" +
		"	wheel_base_id unsigned int(3) NOT NULL,\n" +
		"	wheel_type_id unsigned int(3) NOT NULL,\n" +
		"	manip_style text NOT NULL,\n" +
		"	need_upright_tote tinyint(1) NOT NULL,\n" +
		"	need_upright_bin tinyint(1) NOT NULL,\n" +
		"	can_upright_tote tinyint(1) NOT NULL,\n" +
		"	can_upright_bin tinyint(1) NOT NULL,\n" +
		"	notes text NOT NULL,\n" +
		"	invalid tinyint(1) NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP\n" +
		");",
	
		"CREATE TABLE IF NOT EXISTS wheel_base_lu (\n" +
		"	id integer primary key autoincrement,\n" +
		"	wheel_base_desc text NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
		"	invalid unsigned tinyint(1) NOT NULL DEFAULT '0'\n" +
		");",
	
		"INSERT INTO wheel_base_lu\n" +
		"SELECT 1 AS id, '2 Wheel Drive' AS wheel_base_desc, '2014-01-25 15:23:47' AS timestamp, 0 AS invalid\n" +
		"UNION SELECT 2, '4 Wheel Drive', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 3, '6 Wheel Drive', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 5, 'Crab Drive', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 6, 'Swerve Drive', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 7, 'Tank Drive', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 8, 'Other', '2014-01-25 15:23:47', 0\n" +
		"UNION SELECT 4, '8 Wheel Drive (or more)', '2014-01-25 15:23:47', 0;",
	
		"CREATE TABLE IF NOT EXISTS wheel_type_lu (\n" +
		"	id integer primary key autoincrement,\n" +
		"	wheel_type_desc text NOT NULL,\n" +
		"	timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
		"	invalid unsigned tinyint(1) NOT NULL DEFAULT '0'\n" +
		");",
	
		"INSERT INTO wheel_type_lu\n" +
		"SELECT 1 AS id, 'Kit Wheels' AS wheel_type_desc, '2014-01-25 15:25:39' AS timestamp, 0 AS invalid\n" +
		"UNION SELECT 2, 'IFI', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 3, 'Omni', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 4, 'Mecanum', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 5, 'Nylon', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 6, 'Rubber', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 7, 'Tank Tread', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 8, 'Swerve', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 9, 'Custom', '2014-01-25 15:25:39', 0\n" +
		"UNION SELECT 10, 'Pneumatic', '2014-01-25 15:25:39', 0;"
	};

	public static final String[] SQL_DELETE_ENTRIES = {
		"DROP TABLE IF EXISTS configuration_lu;",
		"DROP TABLE IF EXISTS event_lu;",
		"DROP TABLE IF EXISTS fact_match_data_2015;",
		"DROP TABLE IF EXISTS notes_options;",
		"DROP TABLE IF EXISTS scout_pit_data_2015;",
		"DROP TABLE IF EXISTS wheel_base_lu;",
		"DROP TABLE IF EXISTS wheel_type_lu;"
	};

}