package com.test.functionalinterfacetype;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExampleConsumer {

	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(2,4,5,6,7,8,9,11,12,13,14);
		Consumer<Integer> value= num -> System.out.println(num);
		number.forEach(value);
		
		
		Consumer<String> name= nm -> System.out.println(nm);
		name.accept("Krishnendu");

	}

}
