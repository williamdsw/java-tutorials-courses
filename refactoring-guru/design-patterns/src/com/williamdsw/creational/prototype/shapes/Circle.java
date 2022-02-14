package com.williamdsw.creational.prototype.shapes;

public class Circle extends Shape {

	// FIELDS

	private int radius;

	// CONSTRUCTORS

	public Circle() {
	}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			this.radius = target.radius;
		}
	}

	// GETTERS / SETTERS

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle) || !super.equals(obj))
			return false;
		Circle circle = (Circle) obj;
		return circle.radius == this.radius;
	}

}
