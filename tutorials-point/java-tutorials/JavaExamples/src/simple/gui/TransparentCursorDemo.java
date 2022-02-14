package simple.gui;

import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class TransparentCursorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        TransparentCursor transparentCursor = new TransparentCursor();
        frame.setCursor(transparentCursor.createTransparentCursor());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }
}