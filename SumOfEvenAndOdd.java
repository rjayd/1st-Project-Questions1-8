package com.syntax.class11;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 8, 7, 6 } };
		int odd = 0, even = 0, sumEven = 0, sumOdd = 0;
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				if (num[i][a] % 2 == 0) {
					even = num[i][a];
					sumEven += even;
				} else if (num[i][a] % 2 != 0) {
					odd = num[i][a];
					sumOdd += odd;
				}
			}
		}
		System.out.println("Sum of even numbers: " + sumEven);
		System.out.println("Sum of odd numbers: " + sumOdd);
	}
}
