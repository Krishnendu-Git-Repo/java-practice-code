package com.test.basiccodepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		Integer[] array= {5,8,1,10,4,2};
		
		/* convert this array into list */
		List<Integer> asList = Arrays.asList(array);
		asList.forEach(e-> System.out.println(e));
		
		/* another way to convert this array into list */
		List<Integer> list= new ArrayList<>(Arrays.asList(array));
		
		/* sort this List in ASC order */
		Collections.sort(list);
		
		/* sort this List in DESC order */
		Collections.sort(list, Collections.reverseOrder());
		
		list.forEach(e -> System.out.println(e));
		
		/* another way to sort that array using stream */
		Arrays.stream(array).sorted().forEach(e -> System.out.println(e));
		
		/* for print the index of an arrayList using forEach and enhance for loop */
		int index = 0;
		List<Integer> asList2 = Arrays.asList(5,4,8,3);
		asList2.forEach(e-> System.out.println(asList2.indexOf(e)));
		for(Integer i: asList2) {
			System.out.println(index);
			index++;
		}

	}

}
