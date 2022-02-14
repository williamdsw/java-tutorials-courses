package com.williamdsw.creational.abstract_factory.buttons;

public class WindowsButton implements IButton {

	@Override
	public void paint() {
		System.out.println("Painting Windows button...");
	}

	@Override
	public void onClick() {
		System.out.println("Clicked on Windows button");
	}

	@Override
	public void onDoubleClick() {
		System.out.println("Double clicked on Windows button");
	}

	@Override
	public void onPointerEnter() {
		System.out.println("Pointer entered on Windows button");
	}

	@Override
	public void onPointerExit() {
		System.out.println("Pointer exited on Windows button");
	}
}