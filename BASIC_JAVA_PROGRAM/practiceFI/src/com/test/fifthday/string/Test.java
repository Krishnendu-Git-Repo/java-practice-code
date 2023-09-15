package com.test.fifthday.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> name = Arrays.asList(5, 7, 2, 5, 3, 5, 3, 2, 10, 50, 60);
		Map<Integer, Long> collect = name.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		collect.entrySet().stream().filter(e -> e.getValue() > 1).forEach((v) -> {
			System.out.println(v.getKey() + " is " + v.getValue() + " times");
		});

		String name1 = "geeksforgeeks";
		Stream<Character> mapToObj = name1.chars().mapToObj(c -> (char)c);
		mapToObj.collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey() + "    " + e.getValue()));
		
	}
}
