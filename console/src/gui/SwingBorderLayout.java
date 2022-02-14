package gui;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingBorderLayout {
    private static final String JFRAME_TITLE = "Border Layout Example";
    private static final int JFRAME_WIDTH = 600;
    private static final int JFRAME_HEIGHT = 600;
    private static final int JFRAME_POSITION_X = 400;
    private static final int JFRAME_POSITION_Y = 50;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        JFrame jframe = new JFrame(JFRAME_TITLE);

        // Buttons
        JButton btnLeft = new JButton("LEFT");
        JButton btnRight = new JButton("RIGHT");
        JButton btnTop = new JButton("TOP");
        JButton btnBottom = new JButton("BOTTOM");
        JButton btnCenter = new JButton("CENTER");

        // Adding buttons to frame
        jframe.add(btnLeft, BorderLayout.WEST);
        jframe.add(btnRight, BorderLayout.EAST);
        jframe.add(btnTop, BorderLayout.NORTH);
        jframe.add(btnBottom, BorderLayout.SOUTH);
        jframe.add(btnCenter, BorderLayout.CENTER);

        // Frame properties
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}