package com.chocodev.chocogen.generator.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.chocodev.chocogen.Configuration;
import com.chocodev.chocogen.generator.Generator;
import com.chocodev.chocogen.model.Protocol;
import com.chocodev.chocogen.model.Type;
import com.chocodev.chocogen.util.GenUtils;

public class JavaGenerator implements Generator {
	private final static Logger LOG = Logger.getLogger(JavaGenerator.class.getName());

	@Override
	public void generateBeans(Protocol protocol, Configuration configuration) throws IOException {
		LOG.log(Level.INFO, "Generating Base DTO");

		// BASE DTO
		String basePath = configuration.getOutputFolder() + "/" + configuration.getPackageName().replace(".", "/") + "/gen/model/base/";
		new File(basePath).mkdirs();
		File baseDTOFile = new File(basePath + "/BaseDTO.java");
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("config", configuration);
		velocityContext.put("protocol", protocol);
		FileWriter fw = new FileWriter(baseDTOFile);
		Velocity.evaluate(velocityContext, fw, "base dto", new InputStreamReader(getClass().getResourceAsStream("/java/BaseDTO.vm")));
		fw.flush();
		fw.close();

		// Extended DTO
		String extendedPath = configuration.getOutputFolder() + "/" + configuration.getPackageName().replace(".", "/") + "/gen/model/";
		for (Type type : protocol.getTypes()) {
			File extendedDTOFile = new File(extendedPath + "/" + type.getName() + ".java");
			if (!extendedDTOFile.exists()) {
				FileWriter fwExtended = new FileWriter(extendedDTOFile);
				velocityContext.put("type", type);
				Velocity.evaluate(velocityContext, fwExtended, "extended dto", new InputStreamReader(getClass().getResourceAsStream("/java/ExtendedDTO.vm")));
				fwExtended.flush();
				fwExtended.close();
			}
		}
	}

	@Override
	public void generateLogic(Protocol protocol, Configuration configuration) throws IOException {
		LOG.log(Level.INFO, "Generating Logic");
		String basePath = configuration.getOutputFolder() + "/" + configuration.getPackageName().replace(".", "/") + "/gen/service/base";
		new File(basePath).mkdirs();
		String serviceFile = configuration.getOutputFolder() + "/" + configuration.getPackageName().replace(".", "/") + "/gen/service/base/BaseService.java";
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("config", configuration);
		velocityContext.put("protocol", protocol);

		FileWriter fw = new FileWriter(serviceFile);
		Velocity.evaluate(velocityContext, fw, "base service", new InputStreamReader(getClass().getResourceAsStream("/java/BaseService.vm")));
		fw.flush();
		fw.close();
	}

	@Override
	public void generateTasks(Protocol protocol, Configuration configuration) {
		LOG.log(Level.INFO, "Generating Tasks");
	}

	@Override
	public void copyStatic(Configuration configuration) throws IOException {
		LOG.log(Level.INFO, "Copying resources");
		String utilPath=configuration.getOutputFolder()+"/"+configuration.getPackageName().replace(".", "/")+"/gen/util/";
		new File(utilPath).mkdirs();
		GenUtils.copyResourceToFile(configuration,"/java/static/ServiceFilter.vm",utilPath+"ServiceFilter.java");
		GenUtils.copyResourceToFile(configuration,"/java/static/ResponseWrapper.vm",utilPath+"ResponseWrapper.java");
		GenUtils.copyResourceToFile(configuration,"/java/static/ServiceContext.vm",utilPath+"ServiceContext.java");
	}

}
