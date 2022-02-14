package com.williamdsw.structural.composite.classes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends BaseShape {

	private int radius;

	public Circle(int x, int y, int radius, Color color) {
		super(x, y, color);
		this.radius = radius;
	}

	@Override
	public int getWidth() {
		return radius * 2;
	}

	@Override
	public int getHeight() {
		return radius * 2;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawOval(this.getX(), this.getY(), this.getWidth() - 1, this.getHeight() - 1);
	}
}
