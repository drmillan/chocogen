package com.chocodev.chocogen;

import java.io.File;
import java.io.IOException;

import com.chocodev.chocogen.generator.Generator;
import com.chocodev.chocogen.model.Protocol;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ChocoGen {
	public static final void main(String args[]) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException {
		Configuration configuration = Configuration.loadFrom(new File("generator_config.json"));
		Protocol protocol = new ObjectMapper().readValue(new File(configuration.getDefinitionFile()), Protocol.class);
		Generator generator = SourceLanguage.valueOf(configuration.getLanguage()).getGeneratorClass().newInstance();
		generator.generate(protocol, configuration);
	}
}
