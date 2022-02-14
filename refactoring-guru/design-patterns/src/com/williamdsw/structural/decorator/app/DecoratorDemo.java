package com.williamdsw.structural.decorator.app;

import com.williamdsw.structural.decorator.classes.CompressionDecorator;
import com.williamdsw.structural.decorator.classes.EncryptionDecorator;
import com.williamdsw.structural.decorator.classes.FileDataSource;
import com.williamdsw.structural.decorator.classes.IDataSource;

public class DecoratorDemo {

	public static void decoratorDemo() {
		String filepath = "OutputDemo.txt";
		String content = "They don't write 'em like that anymore\r\n" +
				"They just don't write 'em like that anymore";

		IDataSource dataSource = new FileDataSource(filepath);
		EncryptionDecorator encryption = new EncryptionDecorator(dataSource);
		CompressionDecorator encoded = new CompressionDecorator(encryption);
		encoded.writeData(content);

		IDataSource plain = new FileDataSource(filepath);

		// Output
		String output = "Content: \n%1s \n\nEncoded: \n%2s \n\nDecoded: \n%3s";
		output = String.format(output, content, plain.readData(), encoded.readData());
		System.out.println(output);
	}
}
