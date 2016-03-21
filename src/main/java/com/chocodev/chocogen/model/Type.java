package com.chocodev.chocogen.model;

import java.util.List;

public class Type {
	private String name;
	private Boolean isReference;
	private List<Field> fields;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsReference() {
		return isReference;
	}
	public void setIsReference(Boolean isReference) {
		this.isReference = isReference;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	
	
}
