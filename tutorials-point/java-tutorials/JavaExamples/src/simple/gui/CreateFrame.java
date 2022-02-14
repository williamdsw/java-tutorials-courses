package simple.gui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * @author William
 */

// SIMPLE GUI
public class CreateFrame extends JPanel {
    @Override
    public void paint(Graphics graphics) {
        // Params
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Serif", Font.PLAIN, 48);
        graphics2D.setFont(font);

        // Data
        drawHorizontallyCenteredText(graphics2D, "Initial D: 1st Stage", 200, 75);
        drawHorizontallyCenteredText(graphics2D, "Initial D: 2nd Stage", 200, 125);
        drawHorizontallyCenteredText(graphics2D, "Initial D: 3rd Stage", 200, 175);
    }

    protected void drawHorizontallyCenteredText(Graphics2D graphics2D, String content, float centerX, float baselineY) {
        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
        Rectangle2D rectangle2D = graphics2D.getFont().getStringBounds(content, fontRenderContext);
        float width = (float) rectangle2D.getWidth();
        graphics2D.drawString(content, (centerX - width / 2), baselineY);
    }
}