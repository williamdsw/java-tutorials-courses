package gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingGridLayout {

    private static final String JFRAME_TITLE = "Grid Layout Example";
    private static final int JFRAME_WIDTH = 600;
    private static final int JFRAME_HEIGHT = 600;
    private static final int JFRAME_POSITION_X = 400;
    private static final int JFRAME_POSITION_Y = 50;
    private static final int NUMBER_OF_ROWS = 2;
    private static final int NUMBER_OF_COLUMNS = 3;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        JFrame jframe = new JFrame();

        // Buttons
        JButton btnFirst = new JButton("First");
        JButton btnSecond = new JButton("Second");
        JButton btnThird = new JButton("Third");
        JButton btnFourth = new JButton("Fourth");
        JButton btnFifth = new JButton("Fifth");
        JButton btnSixth = new JButton("Sixth");

        // Adding components to Frame
        jframe.add(btnFirst);
        jframe.add(btnSecond);
        jframe.add(btnThird);
        jframe.add(btnFourth);
        jframe.add(btnFifth);
        jframe.add(btnSixth);

        // Frame properties
        jframe.setLayout(new GridLayout(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS));
        jframe.setTitle(JFRAME_TITLE);
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}