package com.williamdsw.creational.builder.classes;

public class Engine {

	// FIELDS

	private final double volume;
	private double mileage;
	private boolean started;

	// CONSTRUCTOR

	public Engine(double volume, double mileage) {
		this.volume = volume;
		this.mileage = mileage;
	}

	// GETTERS

	public double getVolume() {
		return volume;
	}

	public double getMileage() {
		return mileage;
	}

	// HELPER FUNCTIONS

	public void on() {
		this.started = true;
	}

	public void off() {
		this.started = false;
	}

	public boolean isStarted() {
		return started;
	}

	public void go(double mileage) {
		if (started) {
			this.mileage += mileage;
		} else {
			System.err.println("Cannot go(), you must start engine first!");
		}
	}
}
