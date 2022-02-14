package gui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author William
 */
public class SwingGraphics {
    private static final String JFRAME_TITLE = "Graphics Example";
    private static final int JFRAME_WIDTH = 700;
    private static final int JFRAME_HEIGHT = 700;
    private static final int JFRAME_POSITION_X = 400;
    private static final int JFRAME_POSITION_Y = 50;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        // Line
        JPanel line = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                graphics.drawLine(10, 10, 200, 300);
            }
        };

        // Oval
        JPanel oval = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                graphics.drawOval(100, 100, 100, 100);
            }
        };

        // Rectangle
        JPanel rectangle = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                graphics.drawRect(10, 10, 100, 100);
            }
        };

        // Polygons
        JPanel polygons = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                int xCoordinates[] = { 25, 145, 25, 145, 25 };
                int yCoordinates[] = { 25, 25, 145, 145, 25 };
                int numberOfDots = 5;
                graphics.drawPolygon(xCoordinates, yCoordinates, numberOfDots);
            }
        };

        // Text
        JPanel text = new JPanel() {
            @Override
            public void paint(Graphics graphics) {
                graphics.drawString("Example with drawString ", 10, 10);
            }
        };

        // Adding components to Frame
        JFrame jframe = new JFrame();
        jframe.add(line);
        jframe.add(oval);
        jframe.add(rectangle);
        jframe.add(polygons);
        jframe.add(text);

        // Frame properties
        jframe.setLayout(new GridLayout(3, 3));
        jframe.setTitle(JFRAME_TITLE);
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}