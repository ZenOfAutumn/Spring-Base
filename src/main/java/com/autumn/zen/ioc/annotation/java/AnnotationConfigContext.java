package com.autumn.zen.ioc.annotation.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigContext {

	private static AnnotationConfigApplicationContext ctx;

	static {
		ctx = new AnnotationConfigApplicationContext();
		ctx.register(ServiceConfig.class);
		ctx.refresh();
	}
	
	
}
