package com.test.secondday.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleDuplicateValue {
	List<Integer> value = Arrays.asList(2, 3, 4, 5, 6, 3, 5);
	List<String> name1 = Arrays.asList("Rahul", "Saheb", "Jaddu", "Rahul", "Ram", "Jaddu");
	List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5);
	
	public void testDuplicate() {
		value.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		name1.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
	}
	public void duplicateValueCount() {
		Map<String, Long> collect = name1.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		name1.stream().collect(Collectors.groupingBy(e-> e, Collectors.counting())).entrySet().stream().filter(e-> e.getValue()>1)
		.forEach(e-> System.out.println(e.getKey()+"  is times "+e.getValue()));
		Map<Integer, Long> collect2 = numbers.stream().collect(Collectors.groupingBy(e1 -> e1, Collectors.counting()));
		System.out.println(collect);
		collect.forEach((k, v) -> { 
			if(v > 1) {
				System.out.println(k +" is "+ v + " times");
			}
		});
	}
}
