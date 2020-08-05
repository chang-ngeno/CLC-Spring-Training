package com.clclearning;

public class SteelGrading {
	private int hardness;
	private double carbonContent;
	private int tensileStrength;

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		this.hardness = hardness;
	}

	public double getCarbonContent() {
		return carbonContent;
	}

	public void setCarbonContent(double carbonContent2) {
		this.carbonContent = carbonContent2;
	}

	public int getTensileStrength() {
		return tensileStrength;
	}

	public void setTensileStrength(int tensileStrength) {
		this.tensileStrength = tensileStrength;
	}

	public String getGrade() {
		String grade = "";
		if (this.carbonContent < 0.7 && this.hardness > 50 && this.tensileStrength > 5000) grade = "Grade 10";
		else if(this.carbonContent < 0.7 && this.hardness > 50) grade = "Grade 9";
		else if(this.carbonContent < 0.7 && this.tensileStrength > 5000) grade = "Grade 8";
		else if(this.hardness > 50 && this.tensileStrength > 5000) grade = "Grade 7";
		else if(this.carbonContent < 0.7 || this.hardness > 50 || this.tensileStrength > 5000) grade = "Grade 6";
		else grade = "Grade 5";
		return grade;
	}

}
