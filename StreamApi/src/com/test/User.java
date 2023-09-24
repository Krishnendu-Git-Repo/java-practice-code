package com.test;

public class User {
	
	private int id;
	private String fName;
	private String lName;
	private Integer age;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String fName, String lName, Integer age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
	
}
