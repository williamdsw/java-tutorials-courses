package simple.gui;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author William
 */

// SIMPLE GUI
public class MultipleFonts extends JPanel {

    private final String[] fonts = { "Serif", "SansSerif" };
    private final int[] styleIDs = { Font.PLAIN, Font.ITALIC, Font.BOLD, Font.BOLD + Font.ITALIC };
    private final String[] styleNames = { "Plain", "Italic", "Bold", "Bold & Italic" };

    @Override
    public void paint(Graphics graphics) {
        for (int f = 0; f < fonts.length; f++) {
            for (int s = 0; s < styleIDs.length; s++) {
                Font font = new Font(fonts[f], styleIDs[s], 18);
                graphics.setFont(font);
                String name = String.format("%s %s", fonts[f], styleNames[s]);
                graphics.drawString(name, 20, (f * 4 + s + 1) * 20);
            }
        }
    }
}