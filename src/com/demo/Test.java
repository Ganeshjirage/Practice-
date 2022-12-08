package com.demo;

public class Test extends Exception {
	public Test(String s) {
		super(s);
	}

	public static void main(String[] args) {
		try {
			throw new Test("Invalid inputs ");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
