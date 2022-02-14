package simple.gui;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * @author William
 */

// SIMPLE GUI
public class DisplayPolygonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Polygon");
        frame.setSize(350, 250);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Container contentPane = frame.getContentPane();
        DisplayPolygon displayPolygon = new DisplayPolygon();
        contentPane.add(displayPolygon);
        frame.setVisible(true);
    }
}