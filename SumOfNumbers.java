package com.syntax.class11;

public class SumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 8, 7, 6 } };
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				sum += num[i][a];
				if (a == 0) {
					sum = 0;
					sum += num[i][a];
				}
			}
			System.out.println(sum);
		}
	}

}
