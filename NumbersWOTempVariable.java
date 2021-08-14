package com.syntax.class11;

public class NumbersWOTempVariable {

	public static void main(String[] args) {

		int a=1, b=2;
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("-----RESULT-----");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
	}

}
