package com.test.firstday.reversedstring;

public class ReversedString {
	/* this method for reverse string by StringBuilder */
public String reverseString(String name) {
	StringBuilder stringBuilder= new StringBuilder(name);
	stringBuilder.reverse();
	return stringBuilder.toString();
}

}
