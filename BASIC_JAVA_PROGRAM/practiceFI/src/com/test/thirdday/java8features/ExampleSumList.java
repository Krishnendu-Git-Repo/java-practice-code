package com.test.thirdday.java8features;

import java.util.Arrays;
import java.util.List;

public class ExampleSumList {
	List<Integer> data = Arrays.asList(3, 4, 6, 10, 8);
	List<String> name = Arrays.asList("Akash", "rahul", "Krishnendu");

	public Integer sumData() {
		int sum = data.stream().mapToInt(e->e).sum();
		int sum2 = name.stream().mapToInt(String::length).sum();
		return sum;
	}
}
