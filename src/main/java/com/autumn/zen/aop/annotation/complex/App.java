
package com.autumn.zen.aop.annotation.complex;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Annotation.xml");

	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
		ComplexService complexService = (ComplexService) CP_AOP_ANNOTATION_CTX
				.getBean("complexService");
		NotComplexService notComplexService = (NotComplexService) CP_AOP_ANNOTATION_CTX
				.getBean("notComplexService");
		// and
		LOGGER.info("===================and==================");
		complexService.normalize();
		complexService.logValue();
		
		// not 
		LOGGER.info("===================not==================");
		complexService.logValue();
		notComplexService.logValue();
		
		// or
		LOGGER.info("===================or==================");
		complexService.normalize();
		notComplexService.logValue();
		notComplexService.normalize();
	}

}
