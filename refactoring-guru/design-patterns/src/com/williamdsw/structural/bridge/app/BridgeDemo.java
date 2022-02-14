package com.williamdsw.structural.bridge.app;

import com.williamdsw.structural.bridge.classes.AdvanceRemote;
import com.williamdsw.structural.bridge.classes.BasicRemote;
import com.williamdsw.structural.bridge.classes.Device;
import com.williamdsw.structural.bridge.classes.Radio;
import com.williamdsw.structural.bridge.classes.Television;

public class BridgeDemo {

	private static void testDevice(Device device) {
		System.out.println("Tests with basic remote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote");
		AdvanceRemote advanceRemote = new AdvanceRemote(device);
		advanceRemote.power();
		advanceRemote.mute();
		device.printStatus();
	}

	public static void bridgeDemo() {
		testDevice(new Television());
		testDevice(new Radio());
	}

}
