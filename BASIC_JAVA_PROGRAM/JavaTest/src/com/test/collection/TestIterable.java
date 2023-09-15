package com.test.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterable {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(15,12,815,45,80);
	//list.forEach(e-> System.out.println(e));
	
	Iterator<Integer> iterator = list.iterator();
	iterator.remove();
	System.out.println(iterator);
	
	iterator.forEachRemaining(e -> System.out.println(e));
	
    while(iterator.hasNext()) {
	System.out.println(iterator.next());
     }
	}

   }
