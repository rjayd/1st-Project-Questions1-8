package com.syntax.class11;

public class PrimeNumbers {

	public static void main(String[] args) {

		int[] num = { 1, 5, 19, 20, 54, 71, 21, 101 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				if (num[i] % 3 != 0 && num[i] % 5 != 0 && num[i] % 7 != 0 && num[i] % 9 != 0 && num[i] % 11 != 0) {
					System.out.println(num[i]);
				}
			}
		}
	}
}
