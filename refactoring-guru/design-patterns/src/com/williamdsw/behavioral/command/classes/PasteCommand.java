package com.williamdsw.behavioral.command.classes;

public class PasteCommand extends Command {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (this.editor.getClipboard() == null || this.editor.getClipboard().isEmpty()) {
			return false;
		}

		backup();
		this.editor.getTextArea().insert(this.editor.getClipboard(), this.editor.getTextArea().getCaretPosition());
		return true;
	}
}