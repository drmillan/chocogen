package com.chocodev.chocogen.model;

import java.util.ArrayList;
import java.util.List;

public class Protocol {
	private List<Message> messages=new ArrayList<>();
	private List<Type> types=new ArrayList<>();

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public boolean anyArray()
	{
		for(Type type:types)
		{
			for(Field field:type.getFields())
			{
				if(field.getArray())
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public List<Type> distinctRequestResponses()
	{
		List<Type> distinctRequestResponse=new ArrayList<>();
		for(Message message:getMessages())
		{
			Type requestType=findType(message.getRequest());
			if(!distinctRequestResponse.contains(requestType))
			{
				distinctRequestResponse.add(requestType);
			}
			Type responseType=findType(message.getResponse());
			if(!distinctRequestResponse.contains(responseType))
			{
				distinctRequestResponse.add(responseType);
			}			
		}
		return distinctRequestResponse;
	}

	private Type findType(String name) {
		for(Type type:getTypes())
		{
			if(type.getName().equals(name))
			{
				return type;
			}
		}
		return null;
	}
	
}
