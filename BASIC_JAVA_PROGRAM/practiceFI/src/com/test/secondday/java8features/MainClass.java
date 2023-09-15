package com.test.secondday.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    static List<Integer> integers= Arrays.asList(20, 80, 6, 30, 14,1);
	public static void main(String[] args) {
		
		/* for iterating the list using stream */
		ExampleOfIterating.testInteger();
		ExampleOfIterating exampleOfIterating = new ExampleOfIterating();
		exampleOfIterating.testString();

		/* to find the minimum value of a list using stream */
		Integer minimumValue = ExampleMinimumValue.minimumValue();
		System.out.println(minimumValue);
		
		/* to find the maximum value of a list using stream */
		ExampleMinimumValue exampleMinimumValue= new ExampleMinimumValue();
		exampleMinimumValue.maximumValue();
		exampleMinimumValue.maximumValue1();
		//List<Integer> intNumbers= Arrays.asList(20, 80, 6, 30, 14,1);
		exampleMinimumValue.maximumValue2(integers);
		
		/* to find the minimum value of a list using stream */
		Integer minimumValue1 = ExampleMinimumValue.minimumValue1();
		System.out.println(minimumValue1);
		
		/* to find the minimum value of a list using stream */
		//List<Integer> integers= Arrays.asList(20, 8, 6, 30, 14,1);
		Integer minimumValue2 = ExampleMinimumValue.minimumValue2(integers);
		System.out.println(minimumValue2);
		
		/* Java 8 program to Count Strings whose length is greater than 4 in List */
		ExampleStringLength exampleStringLength= new ExampleStringLength();
		exampleStringLength.stringlength();
		
		/* Java 8 program to multiply 2 to all element in list and print the list */
		List<Integer> multiplieList = ExampleMultiplyWithList.multiplieList();
		multiplieList.forEach(System.out::println);
		
		/* Java 8 program to multiply 10 to all element which are less than 5 in list and print the list */
		ExampleMultiplyWithList exampleMultiplyWithList= new ExampleMultiplyWithList();
		List<Integer> multiplieListTest = exampleMultiplyWithList.multiplieListTest(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		multiplieListTest.forEach(System.out::println);
		
		/* Program to perform concatenation on two list of Integer in java */
		ExampleConcatTwoStreams concatTwoStreams= new ExampleConcatTwoStreams();
		List<Integer> cancatTest = concatTwoStreams.cancatTest();
		cancatTest.forEach(e -> System.out.println(e));
		
		/* Program to perform concatenation on two list of String in java */
		ExampleConcatTwoStreams.cancatStringTest();
		
		/* Program to perform concatenation on two Stream of Integer in java */
		List<Integer> cancatTest1 = concatTwoStreams.cancatTest1();
		cancatTest1.forEach(System.out::println);
		
		/* Program to perform concatenation on two Stream of String in java */
		Stream<String> cancatStringTest1 = ExampleConcatTwoStreams.cancatStringTest1();
		cancatStringTest1.forEach(System.out::println);
		
		/* find largest length and name in List */
		ExampleMinimumValue.maximumLengthString();
		
		/* only distinct value print */
		ExampleDuplicateValue duplicateValue= new ExampleDuplicateValue();
		duplicateValue.testDuplicate();
		
		/* count the duplicate value of a list */
		duplicateValue.duplicateValueCount();
		
		/* count the duplicate value of a list of user define class */
		StudentClass student= new StudentClass(25, "Krish");
		StudentClass student1= new StudentClass(26, "Krish");
		StudentClass student2= new StudentClass(27, "Riju");
		StudentClass student3= new StudentClass(28, "Krish");
		StudentClass student4= new StudentClass(25, "Krishnendu");
		StudentClass student5= new StudentClass(30, "Riju");
		List<StudentClass> list= Arrays.asList(student,student1,student2,student3,student4,student5);
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(e-> e.getName(), Collectors.counting()));
		collect.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+" is "+v+" times");
			}
		});
		
		
		String inputString = "Hello World";

		// Create a stream of characters from the input string
		Stream<Character> charStream = inputString.chars().mapToObj(c -> (char) c);

		// Create a map of character counts using groupingBy and counting collectors
		Map<Character, Long> charCountMap = charStream.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		// Print out the characters that have duplicates and their counts
		charCountMap.entrySet().stream()
		    .filter(entry -> entry.getValue() > 1)
		    .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times in the string."));

		
	}

}
