package com.mm.java8.joda_date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1989, 10, 14);
		Period p = Period.between(birthday, today);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		// age is 34 year 5 months 12 days

	}
}
