package com.test.secondday.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStringLength {
	
	List<String> name= Arrays.asList("Ram","Shyam","Krish","Riju","Krishnendu","Akash");

	/* Java 8 program to Count Strings whose length is greater than 4 in List */
	public void stringlength() {
		List<String> collectString = name.stream().filter(e -> e.length() > 4).collect(Collectors.toList());
		collectString.forEach(e -> System.out.println(e));
		collectString.forEach(System.out::println);
		long count = name.stream().filter(e -> e.length() > 4).count();
		System.out.println("number of string "+count);
	}

}
