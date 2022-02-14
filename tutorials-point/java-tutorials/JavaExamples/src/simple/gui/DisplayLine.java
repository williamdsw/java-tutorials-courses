package simple.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import javax.swing.JApplet;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayLine extends JApplet {
    @Override
    public void init() {
        this.setBackground(Color.WHITE);
        this.setForeground(Color.WHITE);
    }

    @Override
    public void paint(Graphics graphics) {
        int x = 5;
        int y = 7;
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setPaint(Color.GRAY);
        Line2D line2D = new Line2D.Double(x, y, 200, 200);
        graphics2D.draw(line2D);
        graphics2D.drawString("Line", x, 250);
    }
}