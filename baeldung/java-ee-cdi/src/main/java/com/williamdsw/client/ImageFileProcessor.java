package com.williamdsw.client;

import javax.inject.Inject;
import javax.inject.Named;

import com.williamdsw.models.TimeLogger;
import com.williamdsw.qualifiers.PngFileEditorQualifier;
import com.williamdsw.services.ImageFileEditor;

public class ImageFileProcessor {

	// FIELDS

	// @Inject - 1
	private ImageFileEditor imageFileEditor;
	private TimeLogger timeLogger;

	// CONSTRUCTORS

	@Inject // - 2
	public ImageFileProcessor(@PngFileEditorQualifier ImageFileEditor imageFileEditor, TimeLogger timeLogger) {
		this.imageFileEditor = imageFileEditor;
		this.timeLogger = timeLogger;
	}

	// GETTERS - SETTERS

	public ImageFileEditor getImageFileEditor() {
		return imageFileEditor;
	}

	// @Inject - 3
	public void setImageFileEditor(/* @Named ("PngFileEditor") */ ImageFileEditor imageFileEditor) {
		this.imageFileEditor = imageFileEditor;
	}

	public TimeLogger getTimeLogger() {
		return timeLogger;
	}

	public void setTimeLogger(TimeLogger timeLogger) {
		this.timeLogger = timeLogger;
	}

	// FUNCTIONS

	public String openFile(String fileName) {
		String output = "%1s at: %2s";
		output = String.format(output, imageFileEditor.openFile(fileName), timeLogger.getFormattedTime());
		return output;
	}

	public String editFile(String fileName) {
		String output = "%1s at: %2s";
		output = String.format(output, imageFileEditor.editFile(fileName), timeLogger.getFormattedTime());
		return output;
	}

	public String writeFile(String fileName) {
		String output = "%1s at: %2s";
		output = String.format(output, imageFileEditor.writeFile(fileName), timeLogger.getFormattedTime());
		return output;
	}

	public String saveFile(String fileName) {
		String output = "%1s at: %2s";
		output = String.format(output, imageFileEditor.saveFile(fileName), timeLogger.getFormattedTime());
		return output;
	}
}
