package com.williamdsw.creational.singleton.naive;

public class SingletonNotSafe {

	private String value;
	private static SingletonNotSafe instance;

	private SingletonNotSafe(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static SingletonNotSafe getInstance(String value) {
		if (instance == null) {
			instance = new SingletonNotSafe(value);
		}

		return instance;
	}
}
