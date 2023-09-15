package com.test.basiccodepractice;

import java.util.Arrays;

public class MinValueOfAnArray {

	public static void main(String[] args) {
		Integer[] array = { 50, 60, 1, 3, 70, 10, 5, 25 };
		Integer minValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println(minValue);
			
		/* using Stream find the minimum value */
		int min = Arrays.stream(array).min(Integer::compare).get();
        System.out.println("The minimum number is: " + min);

	}

}
