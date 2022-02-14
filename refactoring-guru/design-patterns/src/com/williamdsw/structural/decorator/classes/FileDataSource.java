package com.williamdsw.structural.decorator.classes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

public class FileDataSource implements IDataSource {

	private String name;

	public FileDataSource(String name) {
		this.name = name;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public void writeData(String data) {
		File file = new File(name);

		try (OutputStream stream = new FileOutputStream(file)) {
			stream.write(data.getBytes(), 0, data.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String readData() {
		char[] buffer = null;
		File file = new File(name);

		try (FileReader reader = new FileReader(file)) {
			buffer = new char[(int) file.length()];
			reader.read(buffer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return new String(buffer);
	}

}
