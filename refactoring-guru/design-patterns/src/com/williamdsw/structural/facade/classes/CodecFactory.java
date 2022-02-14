package com.williamdsw.structural.facade.classes;

public class CodecFactory {

	public static ICodec extract(VideoFile file) {
		String type = file.getCodecType();

		switch (type) {
			case "mp4": {
				System.out.println("Codec Factory: extracting mpeg audio...");
				return new MPEG4CompressionCodec();
			}

			case "ogg": {
				System.out.println("Codec Factory: extracting ogg audio...");
				return new OggCompressionCodec();
			}

			case "mkv": {
				System.out.println("Codec Factory: extracting mkv audio...");
				return new MkvCompressionCodec();
			}

			default: {
				return null;
			}
		}
	}

}
