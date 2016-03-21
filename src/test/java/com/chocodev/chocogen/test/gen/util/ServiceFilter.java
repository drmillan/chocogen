package com.chocodev.chocogen.test.gen.util;
public interface ServiceFilter
{
	String preFilter(String url);
	String postFilter(String url);
}