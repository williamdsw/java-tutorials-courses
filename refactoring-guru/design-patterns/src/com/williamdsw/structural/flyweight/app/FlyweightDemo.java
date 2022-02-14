package com.williamdsw.structural.flyweight.app;

import java.awt.Color;

import com.williamdsw.structural.flyweight.classes.Forest;

public class FlyweightDemo {

	// FIELDS

	private static int CANVAS_SIZE = 500;
	private static int TREES_TO_DRAW = 1000000;
	private static int TREE_TYPES = 3;

	// HELPER FUNCTIONS

	public static void flyweightDemo() {
		Forest forest = new Forest();
		for (int index = 0; index < Math.floor(TREES_TO_DRAW / TREE_TYPES); index++) {
			forest.plantTreetAt(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN,
					"Oak texture stub");
			forest.plantTreetAt(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE,
					"Autumn Oak texture stub");
			forest.plantTreetAt(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Winter Oak", Color.WHITE,
					"Winter Oak texture stub");
		}

		forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
		forest.setVisible(true);

		// Output
		int optimizedSize = ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024);
		int notOptimizedSize = ((TREES_TO_DRAW * 38) / 1024 / 1024);
		StringBuilder output = new StringBuilder();
		output.append(String.format("%s trees drawn\n\n", TREES_TO_DRAW));
		output.append("Memory usage:\n");
		output.append(String.format("Tree size (8 bytes) * %s\n", TREES_TO_DRAW));
		output.append(String.format("+ TreeTypes size (~30 bytes) * %s\n", TREE_TYPES));
		output.append(String.format("Total: %1s MB (instead of %2s MB)\n", optimizedSize, notOptimizedSize));
		System.out.println(output.toString());
	}

	private static int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}
