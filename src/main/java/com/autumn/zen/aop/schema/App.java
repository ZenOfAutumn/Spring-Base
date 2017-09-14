
package com.autumn.zen.aop.schema;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_SCHEMA_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Schema.xml");

	public static void main(String[] args) {
		SchemaService ss =(SchemaService)CP_AOP_SCHEMA_CTX.getBean("schemaService");
		ss.map();
	}

}
