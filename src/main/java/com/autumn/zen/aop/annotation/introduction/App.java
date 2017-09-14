
package com.autumn.zen.aop.annotation.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autumn.zen.aop.annotation.LogService;
import com.autumn.zen.aop.annotation.StreamService;

public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Annotation.xml");

	public static void main(String[] args) {
		StreamService streamService = (StreamService) CP_AOP_ANNOTATION_CTX
				.getBean("streamServiceImpl");
		streamService.map();
		streamService.reduce();
		LogService log=(LogService)streamService;
		log.logName();
	}

}
