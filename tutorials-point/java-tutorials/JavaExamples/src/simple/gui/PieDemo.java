package simple.gui;

import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class PieDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().add(new Pie());
        frame.setVisible(true);
    }
}