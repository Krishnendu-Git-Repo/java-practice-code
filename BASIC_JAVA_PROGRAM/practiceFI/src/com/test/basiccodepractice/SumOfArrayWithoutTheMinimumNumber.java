package com.test.basiccodepractice;

import java.util.Arrays;

public class SumOfArrayWithoutTheMinimumNumber {

	public static void main(String[] args) {
		Integer[] array = { 50, 60, 1, 3, 70, 10, 5, 25 };
		Integer sum=0;
		Integer minNumber= array[0];
		for(int i=0; i< array.length; i++) {
			sum+=array[i];
			if(array[i] < minNumber) {
				minNumber= array[i];
			}
		}		
       System.out.println(sum-minNumber);
       
       
		/* using Stream Api */
       Integer minValue = Arrays.stream(array).min(Integer :: compare).get();
       Integer sum2 = Arrays.stream(array).filter(e -> e != minValue).mapToInt(Integer :: intValue).sum();      
       System.out.println(sum2);
	}
	
	

}
