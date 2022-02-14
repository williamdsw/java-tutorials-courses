package com.williamdsw.structural.facade.app;

import java.io.File;

import com.williamdsw.structural.facade.classes.VideoConversionFacade;

public class FacadeDemo {

	public static void facadeDemo() {
		String filePath = "test.ogg";
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4 = converter.convertVideo(filePath, "mp4");
		File mkv = converter.convertVideo(filePath, "mkv");
	}

}
