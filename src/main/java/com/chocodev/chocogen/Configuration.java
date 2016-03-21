package com.chocodev.chocogen;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Configuration {
	private String language;
	private String definitionFile;
	private String packageName;
	private String outputFolder;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDefinitionFile() {
		return definitionFile;
	}
	public void setDefinitionFile(String definitionFile) {
		this.definitionFile = definitionFile;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getOutputFolder() {
		return outputFolder;
	}
	public void setOutputFolder(String outputFolder) {
		this.outputFolder = outputFolder;
	}
	public static Configuration loadFrom(File file) throws JsonParseException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(file, Configuration.class);		
	}
	
}
