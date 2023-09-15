package com.test.practiceofall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestExam {

	public static void main(String[] args) {
	List<Integer> number= Arrays.asList(1,5,5,3,5,6);
	number.stream().collect(Collectors.groupingBy(e-> e, Collectors.counting())).entrySet().stream().filter(e-> e.getKey()==0)
	.forEach(e -> System.out.println(e.getKey()+" times "+e.getValue()));

	}

}
