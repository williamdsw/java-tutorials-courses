package simple.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class MultipleFontsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        MultipleFonts multipleFonts = new MultipleFonts();
        frame.setContentPane(multipleFonts);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}