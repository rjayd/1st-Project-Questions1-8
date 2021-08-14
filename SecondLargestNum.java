package com.syntax.class11;

public class SecondLargestNum {

	public static void main(String[] args) {
		
		int[] num = { 1, 5, 19, 20, 540, 710, 210, 101 };
		int max = num[0] , secondLargest =0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				secondLargest = max;
				max = num[i];
			} else if (secondLargest<num[i])
			secondLargest = num[i];
				
		}
		System.out.println("The second largest value of the array is "+secondLargest);

	}

}
