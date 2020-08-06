package com.clclearning;

import java.util.Set;

public class Farmer {
	private String farmerName;
	private Set<DomesticAnimals> domesticAnimal;

	public void nipeJibuLangu() {
		System.out.println("Hi, " + farmerName + ". You have the following: " + domesticAnimal.toString() + "\n");
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public Set<DomesticAnimals> getDomesticAnimal() {
		return domesticAnimal;
	}

	public void setDomesticAnimal(Set<DomesticAnimals> domesticAnimal) {
		this.domesticAnimal = domesticAnimal;
	}

}
