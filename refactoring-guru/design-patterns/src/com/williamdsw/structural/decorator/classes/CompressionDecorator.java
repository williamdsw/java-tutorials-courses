package com.williamdsw.structural.decorator.classes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {

	private int compressionLevel = 6;

	public CompressionDecorator(IDataSource source) {
		super(source);
	}

	// GETTERS / SETTERS

	public int getCompressionLevel() {
		return compressionLevel;
	}

	public void setCompressionLevel(int level) {
		this.compressionLevel = level;
	}

	// OVERRIDED FUNCTIONS

	@Override
	public void writeData(String data) {
		super.writeData(compress(data));
	}

	@Override
	public String readData() {
		return decompress(super.readData());
	}

	// HELPER FUNCTIONS

	private String compress(String data) {
		String compressed = null;

		try {
			byte[] bytes = data.getBytes();
			try (ByteArrayOutputStream bout = new ByteArrayOutputStream(512)) {
				Deflater deflater = new Deflater(compressionLevel);
				try (DeflaterOutputStream dos = new DeflaterOutputStream(bout, deflater)) {
					dos.write(bytes);
				}

				compressed = Base64.getEncoder().encodeToString(bout.toByteArray());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return compressed;
	}

	private String decompress(String data) {
		String decompressed = null;

		try {
			byte[] bytes = Base64.getDecoder().decode(data);
			try (InputStream inputStream = new ByteArrayInputStream(bytes)) {
				try (InflaterInputStream iin = new InflaterInputStream(inputStream)) {
					try (ByteArrayOutputStream bout = new ByteArrayOutputStream(512)) {
						int b;
						while ((b = iin.read()) != -1) {
							bout.write(b);
						}

						decompressed = new String(bout.toByteArray());
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return decompressed;
	}

}
