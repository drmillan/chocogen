package com.chocodev.chocogen.model;

import com.chocodev.chocogen.SourceLanguage;

public enum FieldMapping {
	INT("Integer"), 
	FLOAT("Float"), 
	DOUBLE("Double"), 
	STRING("String"), 
	BOOLEAN("Boolean"), 
	OBJECT("Object");
	private String javaMapping;

	private FieldMapping(String javaMapping) {
		this.javaMapping = javaMapping;
	}

	public String getMapping(SourceLanguage platform) {
		switch (platform) {
		case JAVA:
			return javaMapping;
		case OBJECTIVEC:
			return javaMapping;
		}
		return "";
	}

	public static String find(String type) {
		for(FieldMapping mapping:values())
		{
			if((mapping.name()).equalsIgnoreCase(type))
			{
				return mapping.javaMapping;
			}
		}
		return type;
	}
}
