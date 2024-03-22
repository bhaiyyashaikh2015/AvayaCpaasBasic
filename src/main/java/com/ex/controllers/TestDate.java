package com.ex.controllers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws InterruptedException {
		
//		Date curDate = new Date();
//		Thread.sleep(10000);
//		Date end = new Date();
//		System.out.println(curDate);
//		System.out.println(end);
//		System.out.println(end.after(curDate));
//		System.out.println(curDate.before(end));
		
		
//		Date date = new Date();
//        Instant instant = date.toInstant();
//        LocalDateTime localDateTime = instant.atZone(ZoneOffset.UTC).toLocalDateTime();
//        
//        LocalDateTime istTime2 = localDateTime.atZone(ZoneOffset.UTC)
//                .withZoneSameInstant(ZoneId.of("Asia/Kolkata"))
//                .toLocalDateTime();
//        
//        System.out.println("date ==> "+date);
//        System.out.println("localDateTime ==> "+localDateTime);
//        System.out.println("istTime2 ==> "+istTime2);
//		
//		LocalDateTime utcTime = LocalDateTime.now(ZoneOffset.UTC);
//
//        // convert UTC time to IST time zone
//        LocalDateTime istTime = utcTime.atZone(ZoneOffset.UTC)
//                                     .withZoneSameInstant(ZoneId.of("Asia/Kolkata"))
//                                     .toLocalDateTime();
//
//        System.out.println("Current IST time: " + istTime);
//        System.out.println("Current UTC time: " + utcTime);
//        System.out.println("Current UTC time: " + utcTime.isBefore(istTime));
//        System.out.println("Current UTC time: " + istTime.isBefore(utcTime));
//        System.out.println("Current UTC time: " + istTime.isAfter(utcTime));
        
		Date date = new Date();

        // convert Date object to LocalDateTime object
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("Date object: " + date);
        System.out.println("LocalDateTime object: " + localDateTime);
        
		
        

	}

}
