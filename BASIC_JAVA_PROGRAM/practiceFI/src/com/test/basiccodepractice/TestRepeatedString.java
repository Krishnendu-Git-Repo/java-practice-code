package com.test.basiccodepractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestRepeatedString {

	public static void main(String[] args) {
	String name="abcabdhakccd";
	//List<Integer> of = List.of(1,5,6);
	Map<Character, Long> collect = name.chars().mapToObj(e -> (char) e)
			.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	collect.entrySet().stream().filter(e -> e.getValue() > 1)
			.forEach(e -> System.out.println(e.getKey() + " is " + e.getValue() + " times"));
	
}

}
