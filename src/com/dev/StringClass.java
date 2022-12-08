package com.dev;

public class StringClass {
	public static void main(String[] args) {
//		String s = "Ganesh";
//		s.concat(" Jirage");
//		System.out.println(s);
//		System.out.println();

//		String s1 = "Ganesh";
//		String s2 = new String("Pune");
//		 s1 = s2;
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println();

		String s3 = new String("Ganesh");
		String s4 = new String("Ganesh");
		System.out.println(s3 == s4);
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
