package com.test.firstday.java8features;

import java.util.StringJoiner;

public class ExampleStringJoin {
  
public void stringJoin() {
	StringJoiner stringJoiner = new StringJoiner(",");
	stringJoiner.add("Krishnendu");
	stringJoiner.add("Samanta");
	stringJoiner.add("Riju");
	System.out.println(stringJoiner);
}
public static StringJoiner stringJoins() {
	StringJoiner joiner= new StringJoiner(",", "@ ", " #");
	joiner.add("KRISHNENDU");
	joiner.add("SAMANTA");
	return joiner;
}
}
