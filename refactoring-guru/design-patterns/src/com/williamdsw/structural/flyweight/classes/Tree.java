package com.williamdsw.structural.flyweight.classes;

import java.awt.Graphics;

public class Tree {

	// FIELDS

	private int x;
	private int y;
	private TreeType treeType;

	// CONSTRUCTOR

	public Tree(int x, int y, TreeType treeType) {
		super();
		this.x = x;
		this.y = y;
		this.treeType = treeType;
	}

	// HELPER FUNCTIONS

	public void draw(Graphics graphics) {
		treeType.draw(graphics, x, y);
	}
}
