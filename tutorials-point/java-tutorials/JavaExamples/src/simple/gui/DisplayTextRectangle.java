package simple.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayTextRectangle extends JComponent {

    private final String content = "message";
    private final int x = 45;
    private final int y = 45;

    @Override
    public void paint(Graphics graphics) {
        graphics.drawRect(10, 10, 200, 200);
        graphics.setColor(Color.RED);
        graphics.drawString(content, x, y);
    }
}