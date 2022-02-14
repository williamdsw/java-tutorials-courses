package com.williamdsw.behavioral.mediator.classes;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

public class TextBox extends JTextArea implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;

	// CONSTRUCTOR

	public TextBox() {
	}

	// GETTERS - SETTERS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "TextBox";
	}

	// FUNCTIONS

	@Override
	protected void processComponentKeyEvent(KeyEvent event) {
		this.mediator.markNote();
	}
}