package com.test.secondday.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMultiplyWithList {
	
	static List<Integer> number= Arrays.asList(10,15,20,25,30,35,40);

	/* Java 8 program to multiply 2 to all element in list and print the list */
	public static List<Integer> multiplieList() {
		List<Integer> collectList = number.stream().map(e -> e*2).collect(Collectors.toList());
		return collectList;
	}
	/* Java 8 program to multiply 10 to all element which are less than 5 in list and print the list */
	public List<Integer> multiplieListTest(List<Integer> data) {
		List<Integer> collectData = data.stream().filter(e -> e<5).map(e -> e*10).collect(Collectors.toList());
		return collectData;
	}

}
