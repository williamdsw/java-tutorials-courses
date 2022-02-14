package com.williamdsw.creational.abstract_factory.buttons;

public class LinuxButton implements IButton {

	@Override
	public void paint() {
		System.out.println("Painting Linux button...");
	}

	@Override
	public void onClick() {
		System.out.println("Clicked on Linux button");
	}

	@Override
	public void onDoubleClick() {
		System.out.println("Double clicked on Linux button");
	}

	@Override
	public void onPointerEnter() {
		System.out.println("Pointer entered on Linux button");
	}

	@Override
	public void onPointerExit() {
		System.out.println("Pointer exited on Linux button");
	}
}