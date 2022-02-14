package com.williamdsw.structural.bridge.classes;

public class Television implements Device {

	// FIELDS

	private boolean isEnabled = false;
	private int volume = 30;
	private int channel = 1;

	// OVERRIDED FUNCTIONS

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	@Override
	public void enable() {
		this.isEnabled = true;
	}

	@Override
	public void disabled() {
		this.isEnabled = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("----------------------");
		System.out.println("| I'm Television.");
		System.out.println("| I'm " + (isEnabled ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("----------------------");
	}

}
