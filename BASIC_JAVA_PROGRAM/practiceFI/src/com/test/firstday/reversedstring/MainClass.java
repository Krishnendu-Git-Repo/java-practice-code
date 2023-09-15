package com.test.firstday.reversedstring;

public class MainClass {

	public static void main(String[] args) {
	String name="Krishnendu Samanta";
	ReversedString reversedString= new ReversedString();
	String reverseString = reversedString.reverseString(name);
    System.out.println(reverseString);
  
    String reverseString2 = ReversedStringByArray.reverseString(name);
    System.out.println(reverseString2);
    
    
    Integer[] arr= {10,8,6,3,2};
    for(int i=arr.length-1; i>=0 ; i--) {
    	System.out.println(arr[i]);
    }
    
	}

}
