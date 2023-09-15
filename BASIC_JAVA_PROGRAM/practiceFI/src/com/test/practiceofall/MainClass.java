package com.test.practiceofall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		
//		List<Integer> integers=Arrays.asList(4,10,3,15,2,17,19);
//		List<Integer> num= new ArrayList<>();
//			num.add(1);
//			num.add(5);
//			num.add(20);
//				
//		System.out.println("List::::::"+integers);
//		Iterator<Integer> iterator = integers.iterator();
//		
//	    ListIterator<Integer> listIterator = num.listIterator(num.size());
//	    System.out.println(listIterator.hasNext());
//	    while(listIterator.hasNext()) {
//	    	System.out.println(listIterator.next());
//	    }
//	    while(listIterator.hasPrevious()) {
//	    	System.out.println(listIterator.previous());
//	    }
//		
//		iterator.forEachRemaining(e-> System.out.println(e));
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5);
//	      
//	      Map<Integer, Long> frequencyMap = numbers.stream()
//	         .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//	      
//	      frequencyMap.forEach((key, value) -> {
//	         if (value > 1) {
//	            System.out.println("Number " + key + " appears " + value + " times.");
//	         }
//	      });
		
		ExampleAbstract abstract1= new ExampleAbstract();
		//abstract1.m1();
		
//		Consumer<Integer> consumer= System.out::println;
//		Arrays.asList(1,2,3,4).forEach(consumer);
//		List<String> name= Arrays.asList("Ram","Riju","Ram","Riju","Rahul");
//		Map<String, Long> collect = name.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//		collect.forEach((k,v) -> {
//			if(v>1) {
//				System.out.println(k+"   "+v);
//			}
//		});
		List<String> nameList = Arrays.asList("Abc","Mno","Pqr","Xyz");
		nameList.removeIf(name -> name.contains("Abc"));
		nameList.add("Mno");
		System.out.println(nameList);
	}
}
