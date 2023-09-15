package com.test.functionalinterfacetype;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(2,4,5,6,7,8,9,11,12,13,14);
		Predicate<Integer> filter= n -> n % 2 == 0;
		number.stream().filter(filter).forEach(System.out :: println);
		
		
		String name= "My name is Krishnendu Samanta";
		Predicate<String> nameFilter= m -> m.length() > 10;
		boolean test = nameFilter.test(name);
		System.out.println(test);

	}

}
