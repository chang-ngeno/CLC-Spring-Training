package com.clclearning;

public class Farmer {
	private String animalName, farmerName;
	private int animalAge;

	public void nipeJibuLangu() {
		System.out.printf("Hi, %s. you have %s with the age of %d years", farmerName, animalName, animalAge);
	}

	public Farmer(String fName, String aName, int aAge) {
		this.farmerName = fName;
		this.animalName = aName;
		this.animalAge = aAge;
	}

}
