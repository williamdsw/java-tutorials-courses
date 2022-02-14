package com.williamdsw.structural.flyweight.classes;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

	// FIELDS

	private static Map<String, TreeType> mapTreeTypes = new HashMap<>();

	// HELPER FUNCTIONS

	public static TreeType getTreeType(String name, Color color, String otherData) {
		TreeType treeType = mapTreeTypes.get(name);
		if (treeType == null) {
			treeType = new TreeType(name, color, otherData);
			mapTreeTypes.put(name, treeType);
		}

		return treeType;
	}
}
