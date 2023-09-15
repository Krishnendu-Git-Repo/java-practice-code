package com.test.secondday.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleMinimumValue {
	static List<Integer> number = Arrays.asList(20, 8, 6, 30, 14, 75, 2);
	static List<String> name= Arrays.asList("Ram","Rahul","Akash","Krishnendu");

	/* find Smallest number in List using min(Comparator.naturalOrder()).get() */
	public static Integer minimumValue() {
		Integer minValue = number.stream().min(Comparator.naturalOrder()).get();
		return minValue;
	}
	
	/* find largest number in List using max(Comparator.naturalOrder()).get() */
	public void maximumValue() {
		List<Integer> number1= Arrays.asList(20, 8, 1, 30, 14, 75, 2);
		System.out.println(number1.stream().max(Comparator.naturalOrder()).get());
	}
	
	/* find Smallest number in List using min(Integer::compare).get() */
	public static Integer minimumValue1() {
		Integer minValue = number.stream().min(Integer :: compare).get();
		return minValue;
	}
	
	/* find largest number in List using max(Integer::compare).get() */
	public void maximumValue1() {
		List<Integer> number1= Arrays.asList(20, 8, 1, 30, 14, 75, 2);
		System.out.println(number1.stream().max(Integer :: compare).get());
	}
	
	/* find Smallest number in List using min(Integer::compareTo).get() */
	public static Integer minimumValue2(List<Integer> number) {
		Integer minValue = number.stream().min(Integer :: compareTo).get();
		return minValue;
	}
	/* find largest number in List using max(Integer::compareTo).get() */
	public void maximumValue2(List<Integer> number) {
		Integer integer = number.stream().max(Integer :: compareTo).get();
		System.out.println(integer);
	}
	/* find largest length and name in List */
	public static void maximumLengthString() {
		Integer maxLength = name.stream().mapToInt(String :: length).max().orElse(0);
		String stringName = name.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("length is "+maxLength+" and name is "+stringName);
	}
}
