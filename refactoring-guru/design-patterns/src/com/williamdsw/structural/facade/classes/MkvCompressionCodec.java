package com.williamdsw.structural.facade.classes;

public class MkvCompressionCodec implements ICodec {

	private String type = "mkv";

	@Override
	public String getType() {
		return this.type;
	}

}
