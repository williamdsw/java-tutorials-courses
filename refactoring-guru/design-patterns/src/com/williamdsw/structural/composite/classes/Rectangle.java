package com.williamdsw.structural.composite.classes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BaseShape {

	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(this.getX(), this.getY(), this.getWidth() - 1, this.getHeight() - 1);
	}

}
