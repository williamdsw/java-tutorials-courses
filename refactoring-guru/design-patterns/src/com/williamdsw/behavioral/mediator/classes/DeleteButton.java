package com.williamdsw.behavioral.mediator.classes;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class DeleteButton extends JButton implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;

	// CONSTRUCTOR

	public DeleteButton() {
		super("Delete");
	}

	// FUNCTIONS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "DeleteButton";
	}

	@Override
	protected void fireActionPerformed(ActionEvent event) {
		mediator.deleteNote();
	}
}