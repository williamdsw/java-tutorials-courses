package com.williamdsw.structural.flyweight.classes;

import java.util.List;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Forest extends JFrame {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private List<Tree> listTrees = new ArrayList<>();

	// HELPER FUNCTIONS

	public void plantTreetAt(int x, int y, String name, Color color, String otherData) {
		TreeType treeType = TreeFactory.getTreeType(name, color, otherData);
		Tree tree = new Tree(x, y, treeType);
		listTrees.add(tree);
	}

	// OVERRIDED FUNCTIONS

	@Override
	public void paint(Graphics graphics) {
		for (Tree tree : listTrees) {
			tree.draw(graphics);
		}
	}

}
