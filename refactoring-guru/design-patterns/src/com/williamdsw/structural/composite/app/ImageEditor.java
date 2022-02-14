package com.williamdsw.structural.composite.app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

import com.williamdsw.structural.composite.classes.CompoundShape;
import com.williamdsw.structural.composite.classes.Shape;

public class ImageEditor {

	private EditorCanvas canvas;
	private CompoundShape allShapes = new CompoundShape();

	public ImageEditor() {
		canvas = new EditorCanvas();
	}

	public void loadShapes(Shape... shapes) {
		allShapes.clear();
		allShapes.add(shapes);
		canvas.refresh();
	}

	// INNER CLASS

	private class EditorCanvas extends Canvas {

		// FIELDS

		private static final long serialVersionUID = 1L;
		private JFrame frame;
		private static final int PADDING = 10;

		// CONSTRUCTOR

		public EditorCanvas() {
			createFrame();
			refresh();
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					allShapes.unSelect();
					allShapes.selectChildAt(e.getX(), e.getY());
					e.getComponent().repaint();
				}
			});
		}

		// HELPER FUNCTIONS

		private void createFrame() {
			frame = new JFrame();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);

			JPanel contentPanel = new JPanel();
			Border border = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
			contentPanel.setBorder(border);
			frame.setContentPane(contentPanel);

			frame.add(this);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		}

		public int getWidth() {
			return allShapes.getX() + allShapes.getWidth() + PADDING;
		}

		public int getHeight() {
			return allShapes.getY() + allShapes.getHeight() + PADDING;
		}

		private void refresh() {
			this.setSize(this.getWidth(), this.getHeight());
			frame.pack();
		}

		public void paint(Graphics graphics) {
			allShapes.paint(graphics);
		}
	}

}
