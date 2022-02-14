package com.williamdsw.creational.abstract_factory.factories;

import com.williamdsw.creational.abstract_factory.buttons.IButton;
import com.williamdsw.creational.abstract_factory.checkboxes.ICheckbox;

public interface IGUIFactory {

	public IButton createButton();

	public ICheckbox createCheckbox();

}
