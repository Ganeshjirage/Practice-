package com.local.date.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateObj);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After Formatting: " + formattedDate);
	}

}
