package gui;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingFlowLayout {

    private static final String JFRAME_TITLE = "Flow Layout Example";
    private static final int JFRAME_WIDTH = 500;
    private static final int JFRAME_HEIGHT = 500;
    private static final int JFRAME_POSITION_X = 400;
    private static final int JFRAME_POSITION_Y = 50;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        JFrame jframe = new JFrame(JFRAME_TITLE);

        // Buttons
        JButton btnSum = new JButton("Sum");
        JButton btnSubstract = new JButton("Susbtract");
        JButton btnMultiply = new JButton("Multiply");
        JButton btnDivide = new JButton("Divide");
        JButton btnModulus = new JButton("Modulus");

        // Adding buttons to frame
        jframe.add(btnSum);
        jframe.add(btnSubstract);
        jframe.add(btnMultiply);
        jframe.add(btnDivide);
        jframe.add(btnModulus);

        // Frame properties
        jframe.setLayout(new FlowLayout());
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}