package com.williamdsw.creational.prototype.shapes;

import java.util.Objects;

public abstract class Shape {

	// FIELDS

	protected int x;
	protected int y;
	protected String color;

	// CONSTRUCTORS

	public Shape() {
	}

	public Shape(Shape target) {
		if (target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		}
	}

	// GETTERS / SETTERS

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Shape))
			return false;
		Shape shape2 = (Shape) obj;
		return shape2.x == this.x && shape2.y == this.y && Objects.equals(shape2.getColor(), this.color);
	}

	// HELPER FUNCTIONS

	public abstract Shape clone();

}
