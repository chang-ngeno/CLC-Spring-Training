package com.clclearning;

public class Person {
	private String firstName;
	private String secondName;
	
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName 
	 * @param secondName
	 */
	public Person(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFullName() {
		return this.getFirstName()+" "+this.getSecondName();
	}
	public void greetPerson() {
		System.out.println("Hello, " + getFullName());
	}
}
