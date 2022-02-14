package simple.gui;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayLineDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Applet params
        JApplet applet = new DisplayLine();
        frame.getContentPane().add("Center", applet);
        applet.init();

        // Frame params
        frame.pack();
        frame.setSize(new Dimension(300, 300));
        frame.setVisible(true);
    }
}