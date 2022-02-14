package com.williamdsw.structural.facade.classes;

import java.io.File;

public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {

		System.out.println("\nVideoConversionFacade: conversion started");

		VideoFile videoFile = new VideoFile(fileName);
		ICodec sourceCodec = CodecFactory.extract(videoFile);
		ICodec destinationCodec = null;

		switch (format) {
			case "mp4": {
				destinationCodec = new MPEG4CompressionCodec();
				break;
			}
			case "ogg": {
				destinationCodec = new OggCompressionCodec();
				break;
			}
			case "mkv": {
				destinationCodec = new MkvCompressionCodec();
				break;
			}
			default: {
				break;
			}
		}

		VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);

		System.out.println("VideoConersionFacade: conversion completed\n");

		return result;
	}

}
