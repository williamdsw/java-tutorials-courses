package com.williamdsw.services;

// import javax.enterprise.inject.Default;
// import javax.inject.Named;

import com.williamdsw.qualifiers.PngFileEditorQualifier;

// @Default
// @Named ("PngFileEditor")
@PngFileEditorQualifier
public class PngFileEditor implements ImageFileEditor {

	private String type = "PNG";

	@Override
	public String openFile(String fileName) {
		return String.format("Opening %1s file: %2s", type, fileName);
	}

	@Override
	public String editFile(String fileName) {
		return String.format("Editing %1s file: %2s", type, fileName);
	}

	@Override
	public String writeFile(String fileName) {
		return String.format("Writing %1s file: %2s", type, fileName);
	}

	@Override
	public String saveFile(String fileName) {
		return String.format("Saving %1s file: %2s", type, fileName);
	}

}
