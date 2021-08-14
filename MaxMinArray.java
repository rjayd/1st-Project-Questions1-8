package com.syntax.class11;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int[] [] num ={ { 1, 5, 19, 20, 54, 71, 210, 101 },{500,2,35}};
		int max = num[0][0] , min = num[0][0];
		for (int i = 0; i < num.length; i++) {
			for(int j=0; j<num[i].length;j++) {
			if (num[i][j]>max) {
				max = num[i][j];
				
			}else if (num[i][j]<min) {
				min=num[i][j];
			}
			}
		}
		System.out.println("The maximum value of the array is "+max);
		System.out.println("The minimum value of the arrat us "+min);
	}

}
