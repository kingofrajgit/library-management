package com.kinlib.currenttime;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.kinlib.money.Fare;

public class CrtTime {
	public static String month = null;

	public static String currenttime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		month = dtf.format(now);

		return month;
	}

	public static long finedays(String month2) {
		currenttime();
		int price=5;
		Fare fare=new Fare();
		fare.setprice(price);
		System.out.println(month);
		LocalDate d1 = LocalDate.parse(month, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate d2 = LocalDate.parse(month2, DateTimeFormatter.ISO_LOCAL_DATE);
		long diff = ChronoUnit.DAYS.between(d2.atStartOfDay(), d1.atStartOfDay());
		diff = fare.moneyproces(diff,price);
		return diff;
	}

}
