package com.williamdsw.creational.builder.classes;

public class GPSNavigator {

	private String route;

	public GPSNavigator() {
		this.route = "1600 Pennsylvania Ave Nw, Washington, DC 20500";
	}

	public GPSNavigator(String manualRoute) {
		this.route = manualRoute;
	}

	public String getRoute() {
		return route;
	}
}
