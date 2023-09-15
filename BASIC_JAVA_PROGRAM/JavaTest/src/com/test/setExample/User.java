package com.test.setExample;

import java.util.Objects;

public class User {
public int age;
public int roll;

public User(int age, int roll) {
	this.age= age;
	this.roll= roll;
}

@Override
public int hashCode() {
	return Objects.hash(age, roll);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return age == other.age && roll == other.roll;
}
}
