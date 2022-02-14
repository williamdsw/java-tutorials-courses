package com.williamdsw.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLogger {

	// FIELDS

	private SimpleDateFormat dateFormat;
	private Calendar calendar;

	// CONSTRUCTOR

	public TimeLogger(SimpleDateFormat dateFormat, Calendar calendar) {
		this.dateFormat = dateFormat;
		this.calendar = calendar;
	}

	// GETTERS - SETTERS

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	// FUNCTIONS

	public String getFormattedTime() {
		return dateFormat.format(calendar.getTime());
	}
}
