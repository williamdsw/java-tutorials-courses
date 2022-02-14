package com.williamdsw.creational.builder.builders;

import com.williamdsw.creational.builder.classes.Engine;
import com.williamdsw.creational.builder.classes.GPSNavigator;
import com.williamdsw.creational.builder.classes.TripComputer;
import com.williamdsw.creational.builder.enums.Transmission;
import com.williamdsw.creational.builder.enums.Type;

public interface IBuilder {

	public void setType(Type type);

	public void setSeats(int seats);

	public void setEngine(Engine engine);

	public void setTransmission(Transmission transmission);

	public void setTripComputer(TripComputer tripComputer);

	public void setGPSNavigator(GPSNavigator gpsNavigator);

}
