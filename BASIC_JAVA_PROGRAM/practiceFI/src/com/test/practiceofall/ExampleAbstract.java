package com.test.practiceofall;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class ExampleAbstract {
	public void m1() {
//		StringJoiner stringJoiner=new StringJoiner(";", "Ms", "Ms");
//		stringJoiner.add("Krish");
//		stringJoiner.add("Riju");
//		stringJoiner.add("Rakesh");
//		System.out.println(stringJoiner);
		
		
//		Random random= new Random();
//		random.ints().limit(5).forEach(e-> System.out.println(e));
		
		
		List<Integer> integers= Arrays.asList(5,8,1,3,80,14,50);
//		integers.stream().sorted().forEach(System.out::println);
//		Integer integer = integers.stream().min(Comparator.comparing(Integer :: valueOf)).get();
//		System.out.println(integer);
		
		
//		List<String> name= Arrays.asList("Ram","Shyam","Jadu","Madhu","Riju","Krishnendu");
////		long count = name.stream().filter(e -> e.length()>4).count();
////		name.stream().filter(e -> e.length()>4).forEach(System.out :: println);
////		System.out.println(count);
//		String string = name.stream().min(Comparator.comparingInt(String :: length)).get();
////		System.out.println(string);
//		
//		
////		integers.stream().map(e-> e*2).forEach(e -> System.out.println(e));
//		
////		Stream.concat(integers.stream(), name.stream()).forEach(System.out::println);
//		
//		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5);
////		numbers.stream().distinct().forEach(System.out::println);
////		numbers.stream().collect(Collectors.toSet()).forEach(System.out::println);
//		
//		Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//		collect.forEach((k,v)-> {
//			if(v>1) {
//			System.out.println(k+"times"+v);
//			}
//		});
//		
////		integers.stream().sorted().forEach(System.out::println);
//		Collections.sort(integers);
//		integers.forEach(System.out::println);
//		
//		int sum = numbers.stream().mapToInt(Integer::valueOf).sum();
//		System.out.println(sum);
		
		Integer[] arr= {4,8,2,6,10,8,3,14,18};
		String str= "Krishnendu Samanta";
		char[] charArray = str.toCharArray();
		for(int i=0; i <charArray.length-1 ; i++) {
			for(int j=i+1; j<charArray.length-1; j++ ) {
			if(charArray[i] == charArray[j])
			 System.out.println(charArray[j]);		
			}
		}
		
	}
}