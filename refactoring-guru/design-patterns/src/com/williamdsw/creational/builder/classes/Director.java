package com.williamdsw.creational.builder.classes;

import com.williamdsw.creational.builder.builders.IBuilder;
import com.williamdsw.creational.builder.enums.Transmission;
import com.williamdsw.creational.builder.enums.Type;

public class Director {

	// HELPER FUNCTIONS

	public void buildSportsCar(IBuilder builder) {
		builder.setType(Type.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void buildCityCar(IBuilder builder) {
		builder.setType(Type.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void buildSUV(IBuilder builder) {
		builder.setType(Type.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}
