package com.dev;

public class JavaOperator {
	
	public static void main(String[] args) {
		//Logical operator  here we are using double && and double||
		int a = 10;
		int b = 20;
		int c = 30;
//		System.out.println(a<b && a<c);
//		System.out.println(a<b || b>c);
//		System.out.println(!(a<b && a<c));
		
		//Bitwise operator   here we are using single & and single |
		int m = 5;
		int n = 10;
		int o = 15;
//		System.out.println(m<n & n>o);
//		System.out.println(m<n & n<o);
//		System.out.println(m<n | n>o);
//		System.out.println(m>n | o<m);
//		System.out.println(!(m>n | o<m));
		
		//Arithmetic operator or unary operator
		int x = 10;
		System.out.println(x++); //10
		System.out.println(x--); //11
		System.out.println(++x); //11
		System.out.println(--x); //10
		
		//ternary operator
		int k = 10;
		int i = 20;
		int num = (k<i) ? k:i;
		System.out.println(num);
		
		//shift operator
		int d = 10;
		System.out.println(d<<2);  //<< multiplication
		System.out.println(d<<3);
		System.out.println(d>>2); //>> Division
		System.out.println(d>>3);

	}

}
