package com.williamdsw.behavioral.mediator.classes;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class AddButton extends JButton implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;

	// CONSTRUCTOR

	public AddButton() {
		super("Add");
	}

	// FUNCTIONS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "AddButton";
	}

	@Override
	protected void fireActionPerformed(ActionEvent event) {
		mediator.addNewNote(new Note());
	}
}