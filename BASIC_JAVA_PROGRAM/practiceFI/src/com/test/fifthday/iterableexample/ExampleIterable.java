package com.test.fifthday.iterableexample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleIterable {
	
	public void m1() {
		List<Integer> list= Arrays.asList(5,2,1,6,4);
		list.forEach(System.out:: println);
		Iterator<Integer> iterator = list.iterator();
		iterator.forEachRemaining(System.out::println);
		ListIterator<Integer> listIterator = list.listIterator(list.size());
		ListIterator<Integer> listIterator2 = list.listIterator();
		listIterator.forEachRemaining(System.out::println);
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		while(listIterator2.hasNext()) {
			Integer next = listIterator2.next();
			System.out.println(next);
		}
		while(listIterator.hasPrevious()) {
			Integer previous = listIterator.previous();
			System.out.println(previous);
		}
		
	}

}
