package com.williamdsw.behavioral.command.classes;

public class CutCommand extends Command {

	// CONSTRUCTOR

	public CutCommand(Editor editor) {
		super(editor);
	}

	// FUNCTIONS

	@Override
	public boolean execute() {
		if (this.editor.getTextArea().getSelectedText() == null
				|| this.editor.getTextArea().getSelectedText().isEmpty()) {
			return false;
		}

		backup();
		String source = this.editor.getTextArea().getText();
		this.editor.setClipboard(this.editor.getTextArea().getSelectedText());
		this.editor.getTextArea().setText(cutString(source));
		return true;
	}

	private String cutString(String source) {
		String start = source.substring(0, this.editor.getTextArea().getSelectionStart());
		String end = source.substring(this.editor.getTextArea().getSelectionEnd());
		return start + end;
	}
}