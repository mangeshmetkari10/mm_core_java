package com.mm.java8.joda_date_time_api;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo1 {

	public static void main(String[] args) {

		System.out.println("Current date and time : " + LocalDateTime.now());

		LocalDateTime localDateTime = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(localDateTime);

		LocalDateTime dt = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt);
		System.out.println("After six months:" + dt.plusMonths(6));
		System.out.println("Before six months:" + dt.minusMonths(6));

		System.out.println(dt);
		System.out.println("After six days:" + dt.plusDays(6));
		System.out.println("Before six days:" + dt.minusDays(6));

		System.out.println(dt);
		System.out.println("After six Hours:" + dt.plusHours(6));
		System.out.println("Before six Hours:" + dt.minusHours(6));

		System.out.println(dt);
		System.out.println("After six Weeks:" + dt.plusWeeks(6));
		System.out.println("Before six Weeks:" + dt.minusWeeks(6));

		System.out.println(dt);
		System.out.println("After six Years:" + dt.plusYears(6));
		System.out.println("Before six Years:" + dt.minusYears(6));

	}

}
