package com.chocodev.chocogen.generator;

import java.io.IOException;

import com.chocodev.chocogen.Configuration;
import com.chocodev.chocogen.model.Protocol;

public interface Generator {
	default void generate(Protocol protocol,Configuration configuration) throws IOException
	{
		copyStatic(configuration);
		generateBeans(protocol,configuration);
		generateLogic(protocol,configuration);
		generateTasks(protocol,configuration);
	}

	void generateTasks(Protocol protocol,Configuration configuration);

	void generateLogic(Protocol protocol,Configuration configuration) throws IOException;

	void generateBeans(Protocol protocol,Configuration configuration) throws IOException;

	void copyStatic(Configuration configuration) throws IOException;
}
