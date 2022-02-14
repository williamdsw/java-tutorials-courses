package com.williamdsw.structural.proxy.classes;

public class Video {

	// FIELDS

	private String id;
	private String title;
	private String data;

	// CONSTRUCTOR

	public Video(String id, String title) {
		this.id = id;
		this.title = title;
		this.data = "Random video";
	}

	// GETTERS / SETTERS

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public String toString() {
		StringBuilder information = new StringBuilder();
		information.append(String.format("ID: %s\n", this.getId()));
		information.append(String.format("Title: %s\n", this.getTitle()));
		information.append(String.format("Video: %s\n", this.getData()));
		return information.toString();
	}
}
