package com.williamdsw.creational.builder.classes;

import com.williamdsw.creational.builder.enums.Transmission;
import com.williamdsw.creational.builder.enums.Type;

public class Manual {

	// FIELDS

	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;

	// CONSTRUCTOR

	public Manual(Type type, int seats, Engine engine, Transmission transmission,
			TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}

	// HELPER FUNCTIONS

	public String print() {
		StringBuilder information = new StringBuilder();

		information.append("Type: ").append(type).append("\n");
		information.append("Number of seats: ").append(seats).append("\n");
		information.append("Engine: ");
		information.append("volume - ").append(engine.getVolume()).append("; ");
		information.append("mileage - ").append(engine.getMileage()).append("\n");
		information.append("Transmission: ").append(transmission).append("\n");
		information.append("Trip Computer: ").append(this.tripComputer != null ? "Functional" : "N/A").append("\n");
		information.append("GPS Navigator: ").append(this.gpsNavigator != null ? "Functional" : "N/A").append("\n");

		return information.toString();
	}

}
