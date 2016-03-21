package com.chocodev.chocogen;

import com.chocodev.chocogen.generator.Generator;
import com.chocodev.chocogen.generator.java.JavaGenerator;
import com.chocodev.chocogen.generator.objectivec.ObjectiveCGenerator;

public enum SourceLanguage {
	JAVA(JavaGenerator.class),OBJECTIVEC(ObjectiveCGenerator.class);
	private Class<? extends Generator> generatorClass;
	private SourceLanguage(Class<? extends Generator> generatorClass)
	{
		this.generatorClass=generatorClass;
	}
	public Class<? extends Generator> getGeneratorClass() {		
		return generatorClass;
	}
}
