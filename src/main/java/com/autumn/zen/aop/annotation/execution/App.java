
package com.autumn.zen.aop.annotation.execution;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Annotation.xml");

	public static void main(String[] args) {
		ExecutionService executionService = (ExecutionService) CP_AOP_ANNOTATION_CTX
				.getBean("executionService");
		executionService.legal();
		executionService.legal("world");
	}

}
