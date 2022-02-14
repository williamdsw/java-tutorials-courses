package com.williamdsw.creational.abstract_factory.app;

import com.williamdsw.creational.abstract_factory.buttons.IButton;
import com.williamdsw.creational.abstract_factory.checkboxes.ICheckbox;
import com.williamdsw.creational.abstract_factory.factories.IGUIFactory;

public class AbstractFactoryApp {

	private IButton button;
	private ICheckbox checkbox;

	public AbstractFactoryApp(IGUIFactory factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}

	public void triggerEvents(boolean toCheck) {
		this.button.paint();
		this.button.onClick();
		this.button.onDoubleClick();
		this.button.onPointerEnter();
		this.button.onPointerExit();

		this.checkbox.paint();

		if (toCheck) {
			this.checkbox.onClick();
		}

		System.out.println(String.format("Checkbox %s checked!", this.checkbox.isChecked() ? "is" : "isn't"));
	}
}