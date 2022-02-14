package com.williamdsw.creational.abstract_factory.app;

import com.williamdsw.creational.abstract_factory.factories.IGUIFactory;
import com.williamdsw.creational.abstract_factory.factories.LinuxFactory;
import com.williamdsw.creational.abstract_factory.factories.MacOSFactory;
import com.williamdsw.creational.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryDemo {

	public static AbstractFactoryApp configureApplication() {
		AbstractFactoryApp app;
		IGUIFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			app = new AbstractFactoryApp(factory);
		} else if (osName.contains("win")) {
			factory = new WindowsFactory();
			app = new AbstractFactoryApp(factory);
		} else {
			factory = new LinuxFactory();
			app = new AbstractFactoryApp(factory);
		}

		return app;
	}
}