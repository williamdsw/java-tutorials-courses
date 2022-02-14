package com.williamdsw.creational.prototype.app;

import java.util.ArrayList;
import java.util.List;

import com.williamdsw.creational.prototype.shapes.Circle;
import com.williamdsw.creational.prototype.shapes.Rectangle;
import com.williamdsw.creational.prototype.shapes.Shape;

public class PrototypeDemo {

	// HELPER FUNCTIONS

	private static void cloneAndCompare(List<Shape> shapes, List<Shape> copies) {
		for (Shape shape : shapes) {
			copies.add(shape.clone());
		}

		for (int index = 0; index < shapes.size(); index++) {
			if (shapes.get(index) != copies.get(index)) {
				System.out.printf("%s : Shapes are different objects", index);

				if (shapes.get(index).equals(copies.get(index))) {
					System.out.println(" and they are identical");
				} else {
					System.out.println(" and they are not identical");
				}
			} else {
				System.out.printf("%s : Shape objects are the same. \n", index);
			}
		}
	}

	public static void prototypeDemo() {
		List<Shape> shapes = new ArrayList<>();
		List<Shape> copies = new ArrayList<>();

		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(20);
		circle.setRadius(15);
		circle.setColor("red");

		Circle otherCircle = (Circle) circle.clone();

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(200);
		rectangle.setHeight(100);
		rectangle.setColor("blue");

		shapes.add(circle);
		shapes.add(otherCircle);
		shapes.add(rectangle);

		cloneAndCompare(shapes, copies);
	}
}
