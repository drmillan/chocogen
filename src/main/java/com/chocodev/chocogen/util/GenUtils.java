package com.chocodev.chocogen.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.chocodev.chocogen.Configuration;

public class GenUtils {
	public static void copyResourceToFile(Configuration configuration,String resourcePath,File outputFile) throws IOException
	{
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("config", configuration);

		FileWriter fw = new FileWriter(outputFile);
		Velocity.evaluate(velocityContext, fw, "fileWrite", new InputStreamReader(GenUtils.class.getResourceAsStream(resourcePath)));
		fw.flush();
		fw.close();
	}

	public static void copyResourceToFile(Configuration configuration,String resourcePath, String outputFilePath) throws IOException{
		copyResourceToFile(configuration,resourcePath, new File(outputFilePath));
	}
}
