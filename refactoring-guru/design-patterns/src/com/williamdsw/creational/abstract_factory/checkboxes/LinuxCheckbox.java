package com.williamdsw.creational.abstract_factory.checkboxes;

public class LinuxCheckbox implements ICheckbox {

	private boolean isChecked = false;

	@Override
	public void paint() {
		System.out.println("Painting Linux Checkbox");
	}

	@Override
	public void onClick() {
		this.isChecked = !this.isChecked;
	}

	@Override
	public boolean isChecked() {
		return isChecked;
	}
}
