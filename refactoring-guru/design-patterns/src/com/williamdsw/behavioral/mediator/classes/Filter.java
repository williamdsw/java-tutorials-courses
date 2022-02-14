package com.williamdsw.behavioral.mediator.classes;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class Filter extends JTextField implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;
	private ListModel listModel;

	// CONSTRUCTOR

	public Filter() {
	}

	// GETTERS - SETTERS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	public void setList(ListModel listModel) {
		this.listModel = listModel;
	}

	@Override
	public String getName() {
		return "Filter";
	}

	// FUNCTIONS

	@Override
	protected void processComponentKeyEvent(KeyEvent event) {
		String start = this.getText();
		searchElements(start);
	}

	private void searchElements(String search) {
		if (listModel == null) {
			return;
		}

		if (search.isEmpty()) {
			mediator.setElementsToList(listModel);
			return;
		}

		List<Note> notes = new ArrayList<>();
		for (int i = 0; i < listModel.getSize(); i++) {
			Note note = (Note) listModel.getElementAt(i);
			notes.add(note);
		}

		DefaultListModel<Note> defaultListModel = new DefaultListModel<>();
		for (Note note : notes) {
			if (note.getName().contains(search)) {
				defaultListModel.addElement(note);
			}
		}

		mediator.setElementsToList(defaultListModel);
	}
}