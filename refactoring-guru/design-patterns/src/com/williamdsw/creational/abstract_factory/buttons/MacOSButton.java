package com.williamdsw.creational.abstract_factory.buttons;

public class MacOSButton implements IButton {

	@Override
	public void paint() {
		System.out.println("Painting MacOS button...");
	}

	@Override
	public void onClick() {
		System.out.println("Clicked on MacOS button");
	}

	@Override
	public void onDoubleClick() {
		System.out.println("Double clicked on MacOS button");
	}

	@Override
	public void onPointerEnter() {
		System.out.println("Pointer entered on MacOS button");
	}

	@Override
	public void onPointerExit() {
		System.out.println("Pointer exited on MacOS button");
	}
}