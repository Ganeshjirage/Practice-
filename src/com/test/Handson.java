package com.test;

public class Handson {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		
		System.out.println("By using class name "+ Practice.a);
		Practice pract = new Practice();
		System.out.println("By using Object creation "+pract.a );

		
		/*
		 * Handson hand = new Handson();
		 * 
		 * System.out.println("Non-static a is " + hand.a++);
		 * System.out.println("Static b is " + hand.b++);
		 * 
		 * Handson hand1 = new Handson(); System.out.println("Non-static a is " +
		 * hand1.a++); System.out.println("Static b is " + hand1.b++);
		 * 
		 * Handson hand2 = new Handson(); System.out.println("Non-static a is " +
		 * hand2.a++); System.out.println("Static b is " + hand2.b++);
		 * 
		 * Handson hand3 = new Handson(); System.out.println("Non-static a is " +
		 * hand3.a++); System.out.println("Static b is " + hand3.b++);
		 */
	}

}
