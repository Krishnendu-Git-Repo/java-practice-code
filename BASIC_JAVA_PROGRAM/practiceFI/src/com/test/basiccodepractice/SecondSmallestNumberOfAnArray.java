package com.test.basiccodepractice;

public class SecondSmallestNumberOfAnArray {

	public static void main(String[] args) {
		Integer[] array = { 50, 61, 1, 3, 70, 10, 5, 25 };
		Integer smallestNumber = Integer.MAX_VALUE;
		Integer secondSmallestNumber = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestNumber) {
				secondSmallestNumber = smallestNumber;
				smallestNumber = array[i];

			} else if (array[i] < secondSmallestNumber) {
				secondSmallestNumber = array[i];
			}
		}
		System.out.println("Smallest number is: "+smallestNumber+"\n" + "Second smallest number is: "+ secondSmallestNumber);

	}

}
