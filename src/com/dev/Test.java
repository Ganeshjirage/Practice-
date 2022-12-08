package com.dev;

public class Test {
	public static void main(String[] args) {
		String s = "India is my country";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.charAt(i));
			char ch = s.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
