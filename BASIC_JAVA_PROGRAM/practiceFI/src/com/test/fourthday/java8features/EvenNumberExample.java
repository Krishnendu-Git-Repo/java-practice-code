package com.test.fourthday.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberExample {
 List<Integer> number= Arrays.asList(4,5,7,8,9,11,16);
 public void evenNumber() {
	 List<Integer> collect = number.stream().filter(e -> (e%2)==0).collect(Collectors.toList());
	 System.out.println(collect);
	 
	 List<Integer> collect2 = number.stream().filter(e -> e.toString().startsWith("1")).collect(Collectors.toList());	 
	 System.out.println(collect2);
	 
	 Integer integer = number.stream().findFirst().get();
	 System.out.println(integer);
	 
	 long count = number.stream().count();
	 System.out.println(count);
 }
}
