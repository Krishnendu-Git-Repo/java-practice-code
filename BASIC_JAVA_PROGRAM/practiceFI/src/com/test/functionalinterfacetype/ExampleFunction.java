package com.test.functionalinterfacetype;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExampleFunction {

	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(2,4,5,6,7,8,9,11,12,13,14);
		Function<Integer, Integer> addData= n -> n+1;
		number.stream().map(addData).forEach(System.out :: println);
		
		Function<String, Integer> lengthOfString= e -> e.length();
		String name= "Krishnendu";
		Integer integer = lengthOfString.apply(name);
		System.out.println(integer);
		

	}

}
