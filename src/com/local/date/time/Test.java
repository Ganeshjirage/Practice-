package com.local.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
	public static void main(String[] args) {
		LocalDate myobj = LocalDate.now();
		LocalTime myobj1 = LocalTime.now();
		LocalDateTime myobj2 = LocalDateTime.now();
		System.out.println(myobj);
		System.out.println();
		System.out.println(myobj1);
		System.out.println();
		System.out.println(myobj2);
	}

}
