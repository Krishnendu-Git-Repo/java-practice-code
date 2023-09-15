package com.test.firstday.reversedstring;

public class ReversedStringByArray {
	/* this method for reverse string by array means iterating */
public static String reverseString(String name) {
	char[] charArray = name.toCharArray();
	String reverseString = "";
	for(int i=charArray.length-1; i>=0; i--) {
		reverseString += charArray[i];
	}
	return reverseString;
}
}
