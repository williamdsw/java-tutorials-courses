package com.williamdsw.structural.composite.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public abstract class BaseShape implements Shape {

	// FIELDS

	private int x;
	private int y;
	private Color color;
	private boolean isSelected = false;

	// CONSTRUCTOR

	protected BaseShape(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public boolean isInsideBounds(int x, int y) {
		return x > this.getX() && x < (this.getX() + getWidth()) &&
				y > this.getY() && y < (this.getY() + getHeight());
	}

	@Override
	public void select() {
		this.isSelected = true;
	}

	@Override
	public void unSelect() {
		this.isSelected = false;
	}

	@Override
	public boolean isSelected() {
		return isSelected;
	}

	@Override
	public void paint(Graphics graphics) {
		if (isSelected()) {
			enableSelectionStyle(graphics);
		} else {
			disableSelectionStyle(graphics);
		}
	}

	// HELPER FUNCTIONS

	protected void enableSelectionStyle(Graphics graphics) {
		graphics.setColor(Color.LIGHT_GRAY);

		Graphics2D graphics2d = (Graphics2D) graphics;
		float width = 1.0f;
		float dashes[] = { 2.0f };
		float miterlimit = 2.0f;
		float dashPhase = 0.0f;

		Stroke stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, miterlimit, dashes,
				dashPhase);
		graphics2d.setStroke(stroke);
	}

	protected void disableSelectionStyle(Graphics graphics) {
		graphics.setColor(this.color);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.setStroke(new BasicStroke());
	}

}
