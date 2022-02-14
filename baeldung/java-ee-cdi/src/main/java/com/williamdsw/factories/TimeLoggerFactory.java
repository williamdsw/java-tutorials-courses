package com.williamdsw.factories;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.enterprise.inject.Produces;

import com.williamdsw.models.TimeLogger;

public class TimeLoggerFactory {

	@Produces
	public TimeLogger getTimeLogger() {
		return new TimeLogger(new SimpleDateFormat("HH:mm"), Calendar.getInstance());
	}

}
