package com.williamdsw.behavioral.mediator.classes;

public class Note {

	// FIELDS

	private String name;
	private String text;

	// CONSTRUCTOR

	public Note() {
		this.name = "New note";
	}

	// GETTERS - SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	// FUNCTIONS

	@Override
	public String toString() {
		return name;
	}
}