package com.mm.java8.joda_date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo1 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);// Asia/Calcutta

		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);// 2024-03-26T07:54:31.511-07:00[America/Los_Angeles]

		System.out.println("Day Of Month : " + zt.getDayOfMonth());
		System.out.println("Day Of Year : " + zt.getDayOfYear());
		System.out.println("Day Of Week : " + zt.getDayOfWeek());
	}

}
