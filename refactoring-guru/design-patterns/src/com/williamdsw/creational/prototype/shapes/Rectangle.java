package com.williamdsw.creational.prototype.shapes;

public class Rectangle extends Shape {

	// FIELDS

	private int width;
	private int height;

	// CONSTRUCTORS

	public Rectangle() {
	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	// GETTERS / SETTERS

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Rectangle) || !super.equals(obj))
			return false;
		Rectangle rectangle = (Rectangle) obj;
		return rectangle.width == this.width && rectangle.height == this.height;
	}
}
