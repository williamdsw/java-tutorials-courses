package simple.gui;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayPolygon extends JPanel {

    private final int NUMBER_OF_OCCURRENCES = 5;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Polygon polygon = new Polygon();
        for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++) {
            int x = (int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5));
            int y = (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5));
            polygon.addPoint(x, y);
            graphics.drawPolygon(polygon);
        }
    }
}