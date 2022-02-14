package com.williamdsw.behavioral.command.classes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Editor {

	// FIELDS

	private JTextArea textArea;
	private String clipboard;
	private CommandHistory history = new CommandHistory();

	// GETTERS - SETTERS

	public JTextArea getTextArea() {
		return textArea;
	}

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	// FUNCTIONS

	public void init() {
		JFrame frame = new JFrame("Text editor");
		JPanel content = new JPanel();

		frame.setContentPane(content);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		content.add(textArea);

		createButtons(content, this);

		frame.setSize(450, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void createButtons(JPanel content, Editor editor) {
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		JPanel panelButtons = new JPanel(layout);

		JButton buttonCtrlC = new JButton("Copy");
		JButton buttonCtrlX = new JButton("Cut");
		JButton buttonCtrlV = new JButton("Paste");
		JButton buttonCtrlZ = new JButton("Undo");

		buttonCtrlC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				executeCommand(new CopyCommand(editor));
			}
		});

		buttonCtrlX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				executeCommand(new CutCommand(editor));
			}
		});

		buttonCtrlV.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				executeCommand(new PasteCommand(editor));
			}
		});

		buttonCtrlZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {
				undo();
			}
		});

		panelButtons.add(buttonCtrlC);
		panelButtons.add(buttonCtrlX);
		panelButtons.add(buttonCtrlV);
		panelButtons.add(buttonCtrlZ);
		content.add(panelButtons);
	}

	private void executeCommand(Command command) {
		if (command.execute()) {
			history.push(command);
		}
	}

	private void undo() {
		if (history.isEmpty()) {
			return;
		}

		Command command = history.pop();
		if (command != null) {
			command.undo();
		}
	}
}