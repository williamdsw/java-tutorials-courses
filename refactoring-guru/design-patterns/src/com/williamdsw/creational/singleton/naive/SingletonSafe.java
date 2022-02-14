package com.williamdsw.creational.singleton.naive;

public class SingletonSafe {

	private String value;
	private static volatile SingletonSafe instance;

	private SingletonSafe(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	// DCL - double cheked locking
	public static SingletonSafe getInstance(String value) {
		SingletonSafe result = instance;
		if (result != null) {
			return result;
		}

		synchronized (SingletonSafe.class) {
			if (instance == null) {
				instance = new SingletonSafe(value);
			}

			return instance;
		}
	}

}
