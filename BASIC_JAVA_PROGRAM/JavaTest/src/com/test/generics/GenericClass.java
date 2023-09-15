package com.test.generics;

public class GenericClass<T> {
public T x;
public GenericClass() {
}

public GenericClass(T x) {
	this.x = x;
}

public T getX() {
	return x;
}

public void setX(T x) {
	this.x = x;
}

}
