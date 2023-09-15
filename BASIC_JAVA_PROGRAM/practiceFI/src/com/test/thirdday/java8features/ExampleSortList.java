package com.test.thirdday.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleSortList {
 List<Integer> numbers= Arrays.asList(80,41,4,7,10,11,3,2);
 public List<Integer> sortData() {
		List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
		//Collections.sort(numbers);
		return collect;
		//return numbers;
	}
 public List<Integer> descSort() {
	 List<Integer> collect = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	 return collect;
 }
}
