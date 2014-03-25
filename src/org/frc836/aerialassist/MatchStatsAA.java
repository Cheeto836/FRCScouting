/*
 * Copyright 2014 Daniel Logan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.frc836.aerialassist;

import java.util.ArrayList;
import java.util.List;

import org.frc836.database.DB;
import org.frc836.database.MatchStatsStruct;
import org.frc836.database.FRCScoutingContract.FACT_CYCLE_DATA_Entry;
import org.frc836.database.FRCScoutingContract.FACT_MATCH_DATA_Entry;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class MatchStatsAA extends MatchStatsStruct {

	public int auto_high;
	public int auto_high_hot;
	public int auto_low;
	public int auto_low_hot;
	public int high;
	public int low;
	public boolean auto_mobile;
	public boolean auto_goalie;

	public SparseArray<CycleStatsStruct> cycles;

	public MatchStatsAA() {
		init();
	}

	public MatchStatsAA(int team, String event, int match) {
		super(team, event, match);
		init();
	}

	public MatchStatsAA(int team, String event, int match, boolean auto) {
		super(team, event, match, auto);
		init();
	}

	public void init() {
		super.init();
		auto_high = 0;
		auto_high_hot = 0;
		auto_low = 0;
		auto_low_hot = 0;
		high = 0;
		low = 0;
		auto_mobile = false;
		auto_goalie = false;
		cycles = new SparseArray<MatchStatsAA.CycleStatsStruct>();
	}

	public ContentValues getValues(DB db, SQLiteDatabase database) {
		ContentValues vals = super.getValues(db, database);

		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_HIGH, auto_high);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_HIGH_HOT, auto_high_hot);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_LOW, auto_low);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_LOW_HOT, auto_low_hot);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_HIGH, high);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_LOW, low);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_MOBILE, auto_mobile ? 1
				: 0);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_GOALIE, auto_goalie ? 1
				: 0);
		vals.put(FACT_MATCH_DATA_Entry.COLUMN_NAME_NUM_CYCLES, cycles.size());

		return vals;
	}

	public List<ContentValues> getCycles(DB db, SQLiteDatabase database) {
		List<ContentValues> vals = new ArrayList<ContentValues>(cycles.size());

		for (int i = 0; i < cycles.size(); i++) {
			vals.add(cycles.valueAt(i).getValues(db, database));
		}

		return vals;
	}

	public class CycleStatsStruct {
		public int cycle_number;
		public boolean near_poss;
		public boolean white_poss;
		public boolean far_poss;
		public boolean truss;
		public boolean truss_catch;
		public boolean high;
		public boolean low;
		public int assists;

		public ContentValues getValues(DB db, SQLiteDatabase database) {
			ContentValues vals = new ContentValues();
			long ev = db.getEventIDFromName(event, database);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_ID, ev * 1000000000l
					+ match * 1000000 + cycle_number * 10000 + team);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_EVENT_ID, ev);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_MATCH_ID, match);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_TEAM_ID, team);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_CYCLE_NUM, cycle_number);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_NEAR_POSS, near_poss ? 1
					: 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_WHITE_POSS,
					white_poss ? 1 : 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_FAR_POSS, far_poss ? 1
					: 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_TRUSS, truss ? 1 : 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_CATCH, truss_catch ? 1
					: 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_HIGH, high ? 1 : 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_LOW, low ? 1 : 0);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_ASSISTS, assists);
			vals.put(FACT_CYCLE_DATA_Entry.COLUMN_NAME_INVALID, 1);

			return vals;
		}
	}

	public void fromCursor(Cursor c, Cursor c2, DB db, SQLiteDatabase database) {
		super.fromCursor(c, db, database);
		c.moveToFirst();

		auto_high = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_HIGH));
		auto_high_hot = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_HIGH_HOT));
		auto_low = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_LOW));
		auto_low_hot = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_LOW_HOT));
		high = c.getInt(c
				.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_HIGH));
		low = c.getInt(c
				.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_LOW));
		auto_mobile = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_MOBILE)) != 0;
		auto_goalie = c
				.getInt(c
						.getColumnIndexOrThrow(FACT_MATCH_DATA_Entry.COLUMN_NAME_AUTO_GOALIE)) != 0;

		c2.moveToFirst();

		do {
			int cyclenum = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_CYCLE_NUM));
			CycleStatsStruct cycle = new CycleStatsStruct();

			cycle.cycle_number = cyclenum;
			cycle.near_poss = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_NEAR_POSS)) != 0;
			cycle.white_poss = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_WHITE_POSS)) != 0;
			cycle.far_poss = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_FAR_POSS)) != 0;
			cycle.truss = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_TRUSS)) != 0;
			cycle.truss_catch = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_CATCH)) != 0;
			cycle.high = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_HIGH)) != 0;
			cycle.low = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_LOW)) != 0;
			cycle.assists = c2
					.getInt(c2
							.getColumnIndexOrThrow(FACT_CYCLE_DATA_Entry.COLUMN_NAME_ASSISTS));

			cycles.put(cyclenum, cycle);

		} while (c2.moveToNext());

	}

}
