package com.test.fifthday.immutableclass;

public final class Student {
private final String name;
private final Integer age;

//public Student() {
//	this.name = "";
//	this.age = null;
//	
//}

public Student(String name, Integer age) {
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public Integer getAge() {
	return age;
}



}
