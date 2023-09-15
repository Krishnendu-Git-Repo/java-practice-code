package com.test.practice.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ClassSum {
	List<Integer> integers= Arrays.asList(2,3,4,5,6);
	public Integer sum() {
		int sum = integers.stream().mapToInt(Integer::valueOf).sum();
		return sum;
	}
	public void filterData() {
		List<Integer> integer= Arrays.asList(6,8,9,10,11,12,14,15);
		List<Integer> collect = integer.stream().map(e-> (e*e)).filter(e-> e>100).collect(Collectors.toList());
		double avg = collect.stream().mapToInt(Integer::valueOf).average().getAsDouble();
		System.out.println(avg);
		
	}
	public void lowestAndHighest() {
	Integer max = integers.stream().max(Comparator.comparing(Integer::valueOf)).get();
	Integer min = integers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		System.out.println(min);
	}
	public void stringJoin() {
		StringJoiner joiner= new StringJoiner(",", "*", "#");
		joiner.add("K");
		joiner.add("R");
		joiner.add("I");
		joiner.add("S");
		System.out.println(joiner);
	}
	public void sortingData() {
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(e-> System.out.println(e));;
	}
	public void filterLength() {
		List<String> name= Arrays.asList("Riju","Kr","Krish","K");
		List<String> collect = name.stream().filter(e-> e.length()>2).collect(Collectors.toList());
		System.out.println(collect);
	}
	public void currentDateTime() {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDateTime localDateTime= LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalTime localTime= LocalTime.now();
		System.out.println(localTime);
	}

}

