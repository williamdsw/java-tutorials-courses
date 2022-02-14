package com.williamdsw.creational.builder.builders;

import com.williamdsw.creational.builder.classes.Car;
import com.williamdsw.creational.builder.classes.Engine;
import com.williamdsw.creational.builder.classes.GPSNavigator;
import com.williamdsw.creational.builder.classes.TripComputer;
import com.williamdsw.creational.builder.enums.Transmission;
import com.williamdsw.creational.builder.enums.Type;

public class CarBuilder implements IBuilder {

	// FIELDS

	private Type type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	// OVERRIDED FUNCTIONS

	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	// HELPER FUNCTIONS

	public Car getCar() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

}
