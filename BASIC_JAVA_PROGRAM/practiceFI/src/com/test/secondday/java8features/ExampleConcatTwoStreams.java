package com.test.secondday.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleConcatTwoStreams {
	List<Integer> value = Arrays.asList(2, 3, 4, 5);
	List<Integer> value1 = Arrays.asList(6, 7, 8);
	List<Integer> concatlist = new ArrayList<>();

	static List<String> name = Arrays.asList("Ram", "Shaym", "Jadu");
	static List<String> name1 = Arrays.asList("Rahul", "Saheb", "Jaddu");
	static List<String> concatlistString = new ArrayList<>();

	/* Program to perform concatenation on two list of Integer in java */
	public List<Integer> cancatTest() {
		concatlist.addAll(value);
		concatlist.addAll(value1);
		return concatlist;
	}

	/* Program to perform concatenation on two list of String in java */
	public static void cancatStringTest() {
		concatlistString.addAll(name);
		concatlistString.addAll(name1);
		System.out.println(concatlistString);
	}
	/* Program to perform concatenation on two Stream of Integer in java */
	public List<Integer> cancatTest1() {
		Stream<Integer> concatStream = Stream.concat(value.stream(), value1.stream());
		return concatStream.collect(Collectors.toList());
	}
	
	/* Program to perform concatenation on two Stream of String in java */
	public static Stream<String> cancatStringTest1(){
		Stream<String> concatStream = Stream.concat(name.stream(), name1.stream());
		return concatStream;
	}

}
