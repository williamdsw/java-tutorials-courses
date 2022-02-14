package com.williamdsw.behavioral.command.classes;

public abstract class Command {

	// FIELDS

	protected Editor editor;
	private String backup;

	// CONSTRUCTOR

	public Command(Editor editor) {
		this.editor = editor;
	}

	// FUNCTIONS

	public abstract boolean execute();

	public void backup() {
		backup = editor.getTextArea().getText();
	}

	public void undo() {
		editor.getTextArea().setText(backup);
	}
}