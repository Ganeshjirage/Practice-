package com.dev;

public class Java {
	// addition
//	public void demo() {
//		int x = 10;
//		int y = 20;
//		System.out.println(x + y);
//	}
//	
	public int myMethod(int x, int y){
		int z = x + y;
		return z;
	}

//	// subtraction
//	public void demo1() {
//		int x = 10;
//		int y = 20;
//		System.out.println(y - x);
//	}
//
//	// multiplication
//	public void demo2() {
//		int x = 10;
//		int y = 20;
//		System.out.println(x * y);
//	}
//
//	// division
//	public void demo3() {
//		int x = 10;
//		int y = 20;
//		System.out.println(y / x);
//	}
//
//	// average
//	public void demo4() {
//		int x = 10;
//		int y = 20;
//		int z = 30;
//		int a = 40;
//		int b = 50;
//		System.out.println((x + y + z + a + b) / 5);
//	}
//// average using array method
//	public void demo5() {
//		int[] x = { 10, 20, 30, 40, 50 };
//		int total = 0;
//		for (int i = 0; i < x.length; i++) {
//			total = total + x[i];
//		}
//		int average = total / x.length;
//		System.out.println(average);
//
//	}

	public static void main(String[] args) {
		Java j = new Java(); //obj creation
//		j.demo();
//		j.demo1();
//		j.demo2();
//		j.demo3();
//		j.demo4();
//		j.demo5();
		int z = j.myMethod(3, 3);
		System.out.println(z);
	}

}
