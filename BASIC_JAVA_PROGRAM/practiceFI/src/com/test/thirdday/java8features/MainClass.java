package com.test.thirdday.java8features;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		ExampleSortList exampleSortList= new ExampleSortList();
		List<Integer> sortData = exampleSortList.sortData();
		System.out.println(sortData);
		
		ExampleSumList exampleSumList= new ExampleSumList();
		Integer sumData = exampleSumList.sumData();
		System.out.println(sumData);
		
		List<Integer> filterData = ExampleCubeOfList.filterData();
		System.out.println(filterData);
		
		List<Integer> descSort = exampleSortList.descSort();
		System.out.println(descSort);
		
		StringBuilder builder= new StringBuilder("Riju");
		String str= "Krishnendu";
		builder.append(str);
		System.out.println(builder);

	}

}
