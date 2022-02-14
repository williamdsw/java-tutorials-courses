package com.williamdsw.structural.composite.app;

import java.awt.Color;

import com.williamdsw.structural.composite.classes.Circle;
import com.williamdsw.structural.composite.classes.CompoundShape;
import com.williamdsw.structural.composite.classes.Dot;
import com.williamdsw.structural.composite.classes.Rectangle;

public class CompositeDemo {

	public static void compositeDemo() {

		// Shapes

		Circle circle = new Circle(10, 10, 10, Color.BLUE);
		CompoundShape firstCompound = new CompoundShape(new Circle(110, 110, 50, Color.RED),
				new Dot(160, 160, Color.RED));
		CompoundShape secondCompound = new CompoundShape(
				new Rectangle(250, 250, 100, 100, Color.GREEN),
				new Dot(240, 240, Color.GREEN),
				new Dot(240, 360, Color.GREEN),
				new Dot(360, 360, Color.GREEN),
				new Dot(360, 240, Color.GREEN));

		ImageEditor editor = new ImageEditor();
		editor.loadShapes(circle, firstCompound, secondCompound);
	}
}
