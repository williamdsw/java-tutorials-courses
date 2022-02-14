package com.williamdsw.structural.facade.classes;

public class MPEG4CompressionCodec implements ICodec {

	private String type = "mp4";

	@Override
	public String getType() {
		return this.type;
	}
}
