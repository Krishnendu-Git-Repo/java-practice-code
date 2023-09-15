package com.test.thirdday.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleCubeOfList {
	static List<Integer> number = Arrays.asList(2, 6, 8, 3, 5, 4, 9, 11, 14);

	public static List<Integer> filterData() {
		List<Integer> collect = number.stream().map(e -> e * e * e).collect(Collectors.toList());
		List<Integer> collect2 = collect.stream().filter(e -> e > 70).collect(Collectors.toList());
		return collect2;
	}
}
