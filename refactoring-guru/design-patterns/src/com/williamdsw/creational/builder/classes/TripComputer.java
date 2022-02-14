package com.williamdsw.creational.builder.classes;

public class TripComputer {

	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void showFuelLevel() {
		System.out.printf("Fuel level: %s\n", car.getFuel());
	}

	public void showStatus() {
		if (this.car.getEngine().isStarted()) {
			System.out.println("Car is started");
		} else {
			System.out.println("Car isn't started");
		}
	}
}
