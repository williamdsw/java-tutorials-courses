package gui;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingJFrame {

    private static final String JFRAME_TITLE = "Any Title";
    private static final int JFRAME_WIDTH = 800;
    private static final int JFRAME_HEIGHT = 600;
    private static final int JFRAME_POSITION_X = 300;
    private static final int JFRAME_POSITION_Y = 50;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        // Frame properties
        JFrame jframe = new JFrame();
        jframe.setTitle(JFRAME_TITLE);
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}