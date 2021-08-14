package com.syntax.class11;

public class OddEven {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 8, 7, 6 } };
		int odd = 0, even = 0;
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				if (num[i][a] % 2 == 0) {
					even = num[i][a];
					System.out.print(even + " ");
				} else if (num[i][a] % 2 != 0) {
					odd = num[i][a];
				}
			}
		}
	}

}
