package com.williamdsw.structural.adapter.classes;

public class RoundHole {

	private double radius;

	public RoundHole(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public boolean itFits(RoundPeg peg) {
		return (this.getRadius() >= peg.getRadius());
	}

}
