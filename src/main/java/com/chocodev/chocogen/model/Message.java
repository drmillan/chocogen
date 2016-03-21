package com.chocodev.chocogen.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message {
	private String name;
	private String url;
	private String method;
	private String request;
	private String response;

	public String getName() {
		return name;
	}

	public void setNaaeme(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<String> urlParameters() {
		List<String> foundParameters = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\$\\{([a-zA-Z0-9]*)\\}");
		Matcher matcher = pattern.matcher(url);
		while (matcher.find()) {
			foundParameters.add(matcher.group(1));
		}
		return foundParameters;

	}

}
