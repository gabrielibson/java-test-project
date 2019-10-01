package com.thoughtworks.hotel.api.model;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public interface IDateHelper {
	
	default String getDayByDate(Calendar date) {
		DateFormatSymbols dfs = DateFormatSymbols.getInstance(Locale.ENGLISH);
		return dfs.getWeekdays()[date.get(Calendar.DAY_OF_WEEK)];
	}

}
