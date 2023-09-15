package com.test.practice.collectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

public class ConcurrrentHashMapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
	    map.put("key1", 1);
	    map.put("key2", 2);
	    map.put("key3", 3);

	    // Iterate over the map
	    for (String key : map.keySet()) {
	        System.out.println(key + " = " + map.get(key));
	    }

	    // Update the value of a key
	    map.put("key1", 10);
	    System.out.println(map);

	    // Check if a key exists
	    if (map.containsKey("key2")) {
	        System.out.println("key2 exists");
	    }

	    // Remove a key
	    map.remove("key3");
	    System.out.println(map);
	    
	    
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	      // using a Predicate to filter even numbers
	      Predicate<Integer> evenNumber = n -> n % 2 == 0;

	      numbers.stream().peek(e-> System.out.println(e+"first peek"))
	             .filter(evenNumber).peek(e-> System.out.println(e+"second peek"))
	             .forEach(System.out::println);
	}
}
