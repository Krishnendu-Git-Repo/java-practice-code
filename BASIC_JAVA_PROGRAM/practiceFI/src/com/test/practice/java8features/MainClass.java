package com.test.practice.java8features;

public class MainClass {

	public static void main(String[] args) {
		ClassSum classSum= new ClassSum();
		Integer sum = classSum.sum();
		System.out.println(sum);
		
		classSum.filterData();
		classSum.lowestAndHighest();
		
		classSum.stringJoin();
		
		classSum.sortingData();
		
		classSum.filterLength();
		
		classSum.currentDateTime();
	}

}
