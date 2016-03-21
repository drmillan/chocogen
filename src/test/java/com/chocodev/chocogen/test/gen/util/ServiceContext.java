package com.chocodev.chocogen.test.gen.util;
import java.util.Map;
import java.util.TreeMap;
public class ServiceContext
{
	private Map<String,String> properties=new TreeMap<String,String>();
	public void put(String key,String value){
		properties.put(key,value);
	}
	public String get(String key){
		return properties.get(key);
	}
}