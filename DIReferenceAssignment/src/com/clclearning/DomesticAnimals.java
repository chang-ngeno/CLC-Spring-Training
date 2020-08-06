package com.clclearning;

public class DomesticAnimals {
	private String animalName;
	private int animalAge;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}

	@Override
	public String toString() {
		return "DomesticAnimals [animalName=" + animalName + ", animalAge=" + animalAge + "]";
	}

}
