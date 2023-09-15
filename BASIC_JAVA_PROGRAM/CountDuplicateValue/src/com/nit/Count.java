package com.nit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Count {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(1,3,2,4,2,1,2); Map<Integer, Integer> map=
		 * new HashMap<>(); Map<Integer, Integer> map1= new HashMap<>(); for(int i= 0;
		 * i< list.size(); i++) { int count= 0; for(int j =0; j< list.size(); j++) {
		 * if(list.get(i) == list.get(j)) { map.put(list.get(i), count++); } } }
		 * list.forEach(e -> { int count=0; list.forEach(ex -> { //map1.put(e, count++);
		 * }); });
		 */
		Set<String> set= new LinkedHashSet<>();
		//set.add(null);
		set.add("Abc");
		set.add(null);
		set.add("EFT");
		set.add("EFT");
		
		System.out.println(set);

	}

}
