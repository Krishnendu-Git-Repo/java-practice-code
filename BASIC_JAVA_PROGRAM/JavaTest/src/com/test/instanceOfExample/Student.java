package com.test.instanceOfExample;

public class Student implements I {
  public int x;

public Student() {
}

public Student(int x) {
	super();
	this.x = x;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

@Override
public String toString() {
	return "Student [x=" + x + "]";
}
  
}
