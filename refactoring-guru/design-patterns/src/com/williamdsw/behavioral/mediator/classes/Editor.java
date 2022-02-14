package com.williamdsw.behavioral.mediator.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Editor implements IMediator {

	// FIELDS

	private AddButton addButton;
	private DeleteButton deleteButton;
	private Filter filter;
	private List list;
	private SaveButton saveButton;
	private TextBox textBox;
	private Title title;

	private JLabel titleLabel = new JLabel("Title:");
	private JLabel textLabel = new JLabel("Text:");
	private JLabel tooltipLabel = new JLabel("Add or select existing note to proceed...");

	// FUNCTIONS

	@Override
	public void addNewNote(Note note) {
		title.setText("");
		textBox.setText("");
		list.addElement(note);
	}

	@Override
	public void deleteNote() {
		list.deleteElement();
	}

	@Override
	public void getInfoFromList(Note note) {
		String name = note.getName().replace("*", "");
		textBox.setText(name);
	}

	@Override
	public void saveChanges() {
		try {
			Note note = (Note) list.getSelectedValue();
			note.setName(title.getText());
			note.setText(textBox.getText());
			list.repaint();
		} catch (Exception e) {
		}
	}

	@Override
	public void markNote() {
		try {
			Note note = list.getCurrentElement();
			String name = note.getName();
			if (!name.endsWith("*")) {
				note.setName(note.getName() + "*");
			}
			list.repaint();
		} catch (Exception e) {
		}
	}

	@Override
	public void clear() {
		title.setText("");
		textBox.setText("");
	}

	@Override
	public void sendToFilter(ListModel listModel) {
		filter.setList(listModel);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setElementsToList(ListModel listModel) {
		this.list.setModel(listModel);
		this.list.repaint();
	}

	@Override
	public void registerComponent(IComponent component) {
		component.setMediator(this);

		switch (component.getName()) {

			case "AddButton": {
				addButton = (AddButton) component;
				break;
			}
			case "DeleteButton": {
				deleteButton = (DeleteButton) component;
				break;
			}
			case "SaveButton": {
				saveButton = (SaveButton) component;
				break;
			}
			case "Filter": {
				filter = (Filter) component;
				break;
			}
			case "TextBox": {
				textBox = (TextBox) component;
				break;
			}
			case "Title": {
				title = (Title) component;
				break;
			}
			case "List": {
				list = (List) component;

				this.list.addListSelectionListener(listener -> {
					Note note = (Note) list.getSelectedValue();
					if (note != null) {
						getInfoFromList(note);
					} else {
						clear();
					}
				});

				break;
			}

			default: {
				break;
			}
		}

	}

	@Override
	public void hideElements(boolean flag) {
		textLabel.setVisible(!flag);
		titleLabel.setVisible(!flag);
		tooltipLabel.setVisible(!flag);
		textBox.setVisible(!flag);
		title.setVisible(!flag);
		saveButton.setVisible(!flag);
	}

	@Override
	public void createGUI() {
		JFrame notesFrame = new JFrame();
		notesFrame.setSize(960, 600);
		notesFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new LineBorder(Color.BLACK));
		leftPanel.setSize(320, 600);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		JPanel filterPanel = new JPanel();
		filterPanel.add(new JLabel("Filter:"));
		filter.setColumns(20);
		filterPanel.add(filter);
		filterPanel.setPreferredSize(new Dimension(280, 40));

		JPanel listPanel = new JPanel();
		list.setFixedCellWidth(260);
		listPanel.setSize(320, 740);

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setPreferredSize(new Dimension(275, 410));
		listPanel.add(scrollPane);

		JPanel buttonsPanel = new JPanel();
		addButton.setPreferredSize(new Dimension(85, 25));
		deleteButton.setPreferredSize(new Dimension(85, 25));
		buttonsPanel.add(addButton);
		buttonsPanel.add(deleteButton);
		buttonsPanel.setLayout(new FlowLayout());

		leftPanel.add(filterPanel);
		leftPanel.add(listPanel);
		leftPanel.add(buttonsPanel);

		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(null);
		rightPanel.setSize(640, 600);
		rightPanel.setLocation(320, 0);
		rightPanel.setBorder(new LineBorder(Color.BLACK));

		titleLabel.setBounds(20, 4, 50, 20);
		title.setBounds(60, 5, 555, 20);
		textLabel.setBounds(20, 4, 50, 130);
		textBox.setBorder(new LineBorder(Color.DARK_GRAY));
		textBox.setBounds(20, 80, 595, 410);
		saveButton.setBounds(270, 535, 80, 25);
		tooltipLabel.setFont(new Font("Verdana", Font.PLAIN, 22));
		tooltipLabel.setBounds(100, 240, 500, 100);

		rightPanel.add(tooltipLabel);
		rightPanel.add(titleLabel);
		rightPanel.add(title);
		rightPanel.add(textLabel);
		rightPanel.add(textBox);
		rightPanel.add(saveButton);

		notesFrame.setLayout(null);
		notesFrame.getContentPane().add(leftPanel);
		notesFrame.getContentPane().add(rightPanel);
		notesFrame.setResizable(false);
		notesFrame.setLocationRelativeTo(null);
		notesFrame.setVisible(true);
	}
}