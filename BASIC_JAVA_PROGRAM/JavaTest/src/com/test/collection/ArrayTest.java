package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		Integer[] array = new Integer[10];
		
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		for(Integer a : array) {
			System.out.println(a);
		}
		int j=130;
		Integer i=130;
		
		System.out.println(j==i);
		System.out.println(i.equals(j));
		
		List<Integer> l= new ArrayList<>();
		System.out.println(l.size());

	}

}
