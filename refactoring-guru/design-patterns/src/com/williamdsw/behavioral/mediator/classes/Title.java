package com.williamdsw.behavioral.mediator.classes;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

public class Title extends JTextArea implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;

	// CONSTRUCTOR

	public Title() {
	}

	// GETTERS - SETTERS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "Title";
	}

	// FUNCTIONS

	@Override
	protected void processComponentKeyEvent(KeyEvent event) {
		this.mediator.markNote();
	}
}