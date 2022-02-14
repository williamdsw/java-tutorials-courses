package com.williamdsw.structural.flyweight.classes;

import java.awt.Color;
import java.awt.Graphics;

public class TreeType {

	// FIELDS

	private String name;
	private Color color;
	private String otherData;

	// CONSTRUCTOR

	public TreeType(String name, Color color, String otherData) {
		super();
		this.name = name;
		this.color = color;
		this.otherData = otherData;
	}

	// HELPER FUNCTIONS

	public void draw(Graphics graphics, int x, int y) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(x - 1, y, 3, 5);
		graphics.setColor(color);
		graphics.fillOval(x - 5, y - 10, 10, 10);
	}
}
