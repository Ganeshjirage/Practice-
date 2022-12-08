package com.ganesh;

public class ReverseNumber {
	public static int getReverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(getReverseNumber(123));
	}

}
