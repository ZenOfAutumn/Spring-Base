package com.autumn.zen.resource;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class ConcreteResource {

	static final Resource classPathResource = new ClassPathResource("classpath://Application-Context-Main.xml");

	static final Resource filePathResource = new FileSystemResource(
			System.getProperty("user.dir")+"/src/main/resources/Application-Context-Main.xml");

	static Resource urlResource;
	static {
		try {
			urlResource = new UrlResource(new URL("http://maven.apache.org/xsd/maven-4.0.0.xsd"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	
}
