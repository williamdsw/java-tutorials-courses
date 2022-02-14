package gui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author William
 */
public class SwingComponents {
    private static final int JFRAME_WIDTH = 300;
    private static final int JFRAME_HEIGHT = 300;
    private static final int JFRAME_POSITION_X = 400;
    private static final int JFRAME_POSITION_Y = 50;

    public static void main(String[] args) {
        setupFrame();
    }

    private static void setupFrame() throws HeadlessException {
        JFrame jframe = new JFrame();

        // Name
        JLabel lblName = new JLabel();
        lblName.setText("Your name:");
        lblName.setBounds(10, 10, 100, 100);
        JTextField txtName = new JTextField();
        txtName.setBounds(110, 50, 130, 30);

        // Send button
        JButton btnSend = new JButton();
        btnSend.setText("Send");
        btnSend.setBounds(100, 100, 140, 40);

        // Information
        JLabel lblInformation = new JLabel();
        lblInformation.setBounds(10, 110, 200, 100);

        // Adding components to JFrame
        jframe.add(lblName);
        jframe.add(txtName);
        jframe.add(btnSend);
        jframe.add(lblInformation);

        // Listener
        btnSend.addActionListener((ActionEvent event) -> {
            String text = (!txtName.getText().isEmpty() ? txtName.getText() + " was send!" : "Type your name!");
            lblInformation.setText(text);
        });

        // Frame properties
        jframe.setLayout(null);
        jframe.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
        jframe.setLocation(JFRAME_POSITION_X, JFRAME_POSITION_Y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}