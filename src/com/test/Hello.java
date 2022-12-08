package com.test;

public class Hello {
//	static void myMethod(String fname) {
//		System.out.println("Hi " + fname + " Good Morning!");
//	}
//	static void myMethod2(String fname, int age){
//		System.out.println(fname + " is " + age);
//	}
//	static int myMethod3(int x, int y){
//		return x + y;
//	}
//	static void checkAge(int age) {
//		if (age < 18) {
//			System.out.println("Access denied - You are not old enough!");
//		}
//		else {
//			System.out.println("Access granted - You are old enough!");
//		}
//	}
//	static int plusMethod(int x, int y) {
//		return x+y;
//	}
//	static double plusMethod(double x, double y) {
//		return x+y;
//	}
	public static int sum(int x, int y) {
		if (y > x){
			return y + sum(x, y-1);
		}
		else {
			return y;
		}
	}
	public static void main(String[] args) {
		//first method
//		myMethod("Ganesh,");
//		myMethod("Mininath,");
//		myMethod("Vaibhav,");
//		//second method
//		myMethod2("Ganesh",23);
//		myMethod2("Mininath",25);
//		//third method
//		int z= myMethod3(5,3);
//		System.out.println(z);
		//method so called chechAge
//		checkAge(17);
//		int myNum1= plusMethod(5, 5);
//		double myNum2= plusMethod(4.5, 5.5);
//		System.out.println("int: " + myNum1);
//		System.out.println("double: " + myNum2);
//		int x = 10;
//		System.out.println(x);
		int result = sum(5,10);
		System.out.println(result);
		char ch = 'a';
		System.out.println(ch);
	}
}
