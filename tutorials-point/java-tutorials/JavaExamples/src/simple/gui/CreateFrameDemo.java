package simple.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class CreateFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        CreateFrame createFrame = new CreateFrame();
        frame.getContentPane().add(createFrame);
        frame.setSize(450, 350);
        frame.setVisible(true);
    }
}