package com.williamdsw.structural.decorator.classes;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(IDataSource source) {
		super(source);
	}

	// OVERRIDED FUNCTIONS

	@Override
	public void writeData(String data) {
		super.writeData(encode(data));
	}

	@Override
	public String readData() {
		return decode(super.readData());
	}

	// HELPER FUNCTIONS

	private String encode(String data) {
		byte[] result = data.getBytes();

		for (int index = 0; index < result.length; index++) {
			result[index] += (byte) 1;
		}

		return Base64.getEncoder().encodeToString(result);
	}

	private String decode(String data) {
		byte[] result = Base64.getDecoder().decode(data);

		for (int index = 0; index < result.length; index++) {
			result[index] -= (byte) 1;
		}

		return new String(result);
	}

}
