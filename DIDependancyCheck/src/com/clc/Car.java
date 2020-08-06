package com.clc;

public class Car {
	private String carName;
	private Engine engine;

	public void setCarName(String model) {
		this.carName = model;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return this.getEngine();
	}

	public void semaJina() {
		System.out.printf("Car name: %s\nEngine Year %s", carName, engine.getModelYear());
	}
}
