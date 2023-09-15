package com.test.secondday.java8features;

import java.util.ArrayList;
import java.util.List;

public class ExampleOfIterating {
	/* Program to iterate stream using forEach in java 8 */
	public static void testInteger() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(15);
		integers.add(25);
		integers.add(35);
		integers.stream().forEach(System.out::println);
	}

	public void testString() {
		List<String> strings = new ArrayList<>();
		String a="A";
		String b= "B";
		a.concat(b);
		String replace = a.replace("A", "C");	    
		System.out.println(replace);
		
		strings.add("Hii");
		strings.add("Hello");
		strings.add("Hellow");
		strings.stream().forEach(e -> System.out.println(e));
	}

}
