package com.cucumber.framework.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeHelper {
	public static String getCurrentTime()
	{
		DateFormat dateformat = new SimpleDateFormat("_yyyy-mm-dd_HH-mm-ss");
		Calendar cal=Calendar.getInstance();
		String time =""+dateformat.format(cal.getTime());
		return time;
	}
	public static String getCurrentDate()
	{
		return getCurrentTime().substring(0, 11);
	}
	public static void main(String[] args) {
		System.out.println(getCurrentDate());
		System.out.println(getCurrentTime());
	}
}
