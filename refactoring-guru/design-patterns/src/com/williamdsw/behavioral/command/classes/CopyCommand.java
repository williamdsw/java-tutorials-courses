package com.williamdsw.behavioral.command.classes;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		this.editor.setClipboard(this.editor.getTextArea().getSelectedText());
		return false;
	}
}