package com.test.singletone;

public class ClassSingleTone {

private static volatile ClassSingleTone classSingleTone = null;
public String string;
public static synchronized ClassSingleTone getmethod() {
	 if(classSingleTone== null) {
		classSingleTone= new ClassSingleTone();
	}
	return classSingleTone;
}
private ClassSingleTone() {
	string="Krishnendu";
	System.out.println(string);
}
	}