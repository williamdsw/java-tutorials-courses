package com.williamdsw;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.williamdsw.client.ImageFileProcessor;

public class CdiIntroductionApplication {

	public static void main(String[] args) {

		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		ImageFileProcessor processor = container.select(ImageFileProcessor.class).get();

		System.out.println(processor.openFile("file1.png"));

		container.shutdown();
	}

}
