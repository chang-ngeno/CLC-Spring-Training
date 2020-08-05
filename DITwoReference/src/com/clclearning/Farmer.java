package com.clclearning;

public class Farmer {
	private String farmerName;
	private DomesticAnimals domesticAnimal;
	private FarmTools farmTools;

	public void nipeJibuLangu() {
		System.out.printf("Hi, %s. you have %s with the age of %d years, You own %s, used for %s", 
				farmerName,
				domesticAnimal.getAnimalName(), 
				domesticAnimal.getAnimalAge(), 
				farmTools.getName(),
				farmTools.getDescription());
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public DomesticAnimals getDomesticAnimal() {
		return domesticAnimal;
	}

	public void setDomesticAnimal(DomesticAnimals domesticAnimal) {
		this.domesticAnimal = domesticAnimal;
	}

	public FarmTools getFarmTools() {
		return farmTools;
	}

	public void setFarmTools(FarmTools farmTools) {
		this.farmTools = farmTools;
	}


}
