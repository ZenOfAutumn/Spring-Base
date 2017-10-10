package com.autumn.zen.applocationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextCollection {

	// classpath: 类的根路径
	public static final ClassPathXmlApplicationContext CLASS_PATH_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-Main.xml");

	// IoC Annotation Application Context
	public static final ClassPathXmlApplicationContext CP_IoC_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-IoC-Annotation.xml");

	// AOP Annotation Application Context
	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
		"classpath:Application-Context-AOP.xml");

	// filepath: 文件路径
	public static final FileSystemXmlApplicationContext FILE_SYSTEM_CTX = new FileSystemXmlApplicationContext(
			System.getProperty("user.dir") + "/src/main/resources/Application-Context-Main.xml");

	
	
}
