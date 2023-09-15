package com.test.fifthday.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringClass {

	//synchronized final public static void main(String[] args) {    // it is also a valid main method
	public static void main(String[] args) {
    String str= "Krish";
    String str1= "nendu";
    
    str.concat(str1);
    System.out.println(str);
    
    String concat = str.concat(str1);
    System.out.println(concat);
    
    str1.replace(str1, "Samanta");
    System.out.println(str1);
    
    String replace = str1.replace("nendu", "Samanta");
    System.out.println(replace);
    
    String concat2 = concat.concat(" "+replace);
    System.out.println(concat2);
    
    System.out.println(concat2.charAt(11));
    for(int i=0; i< concat2.length();i++) {
    	String add="";
    	add+=concat2.charAt(i);
    	System.out.println(add);
    }
    for(int i=concat2.length()-1; i>=0; i--) {
    	System.out.println(concat2.charAt(i));
    }
    System.out.println(concat2.codePointAt(2));
    System.out.println(concat2.codePointBefore(3));
    
    char[] charArray = concat2.toCharArray();
//    for(int i=0; i<charArray.length; i++) 
    String add="";
    for(char c: charArray)
    {
    	add+=c;	
    }
    System.out.println("name is-> "+add);
    String string="  Riju    ";
    System.out.println(string);
    String trim = string.trim();
    System.out.println(trim);
    
    System.out.println(string.startsWith(" "));
    System.out.println(string.contains("r".toUpperCase()));
    
    System.out.println(String.valueOf(trim));
   
    
    String strr=" ";
	String st= null;
	System.out.println(strr==st);
	System.out.println(strr.equals(st));
	String trimm = strr.trim();
	System.out.println(trimm.isEmpty());
	System.out.println(strr.equals("")+" "+strr.isEmpty());
	
	String name="KRISHNENDU SAMANTA";
	String reverseName="";
	
	char[] nameArray = name.toCharArray();
	for(int i= nameArray.length-1; i>=0;i--) {
		reverseName+=nameArray[i];
	}
	System.out.println(reverseName);
    
	String a="";
	String b=" ";
	String trimString = a.trim();
	
	System.out.println(a.equals(b));
	System.out.println(a==b);
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	System.out.println(a.isEmpty());
	System.out.println(b.isEmpty());
	
	System.out.println(a.equals(trimString));
	
	String myName="KrishnenduSamanta";
	CharSequence subSequence = myName.subSequence(10, 17);
	System.out.println(subSequence);
	
	String substring = myName.substring(10, 17);
	System.out.println(substring);
	
	String s1= "abc";
	String s2= "def";
	String s3= s1+s2;
	String s4= "abcdef";
	String s5= "abcdef";
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s3));
	System.out.println(s3);
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	
	System.out.println(s4==s5);
	
	String name1= "krishnendusamanta";
	name1.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(e-> e, Collectors.counting())).entrySet().
	stream().filter(e-> e.getValue()>1).forEach(e-> System.out.println(e.getKey()+" is "+ e.getValue()+" times"));
	
	
	
	
	
	}

}
