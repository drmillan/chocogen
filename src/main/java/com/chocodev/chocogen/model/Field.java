package com.chocodev.chocogen.model;

import com.chocodev.chocogen.Configuration;

public class Field {
	private String name;
	private String type;
	private Boolean array = Boolean.FALSE;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getArray() {
		return array;
	}

	public void setArray(Boolean array) {
		this.array = array;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String derivedType(Configuration configuration) {
		String value = getSingleType(getType());
		if (value != null) {
			if (array.booleanValue()) {
				return "List<"+value+">";
			} else {
				return value;
			}
		}
		if (array.booleanValue()) {
			return "List<"+getType() +">";
		} else {
			return getType();
		}
		
	}
	private String getSingleType(String type) {
		String returnValue=FieldMapping.find(type);		
		if(returnValue.equals(type) && !returnValue.equals("String"))
		{
			return returnValue;
		}
		return returnValue;
	}

	public String defaultValue(Configuration configuration)
	{
		if (array.booleanValue()) {
			return "new ArrayList<"+getSingleType(getType()) +">()";
		} else {
			return "null";
		}
	}	
	public String nameFirstUpperCase()
	{
		return name.substring(0, 1).toUpperCase()+name.substring(1);
	}
}
