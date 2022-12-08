package com.demo;

public class Student {
	//instance variable
	int a = 10;
	int b = 20;
	int c;
	//static variable
	static int m = 25;
	static int n;// static keyword
	public static void main(String[] args) {
		//local variable
		int x = 50;
		int y = 200;
	
		System.out.println("Local Variable: x is " + x);
		System.out.println("Local Variable: y is " + y);
		//instance variable
		Student s= new Student();//creation of object
		System.out.println("Instance Var: The value of int a is " + s.a);
		System.out.println("Instance Var: The value of int b is " + s.b);
		System.out.println("Instance Var: The value of int c is " + s.c);
		//static variable
		System.out.println("Static Var: By using Object " + s.m);
		System.out.println("Static Var: By using class " + Student.m);
		System.out.println("Static Var: By using variable " + m);
		System.out.println("Static Var: With declaration " + n);
		s.methodOne();

	}
	public void methodOne() {
		System.out.println("Instance variable by creating method is " + 10);
	}
}
