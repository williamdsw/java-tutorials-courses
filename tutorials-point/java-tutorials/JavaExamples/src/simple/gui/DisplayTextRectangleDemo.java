package simple.gui;

import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayTextRectangleDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(new DisplayTextRectangle());
        frame.setVisible(true);
    }
}