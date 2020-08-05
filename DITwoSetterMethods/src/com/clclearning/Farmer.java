package com.clclearning;

public class Farmer {
	private String animalName, farmerName;
	private int animalAge;

	public void nijibuVizuri() {
		System.out.printf("Hi, %s. you have %s with the age of %d years", farmerName, animalName, animalAge);
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

}
