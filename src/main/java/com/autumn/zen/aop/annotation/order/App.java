
package com.autumn.zen.aop.annotation.order;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Annotation.xml");

	public static void main(String[] args) {
		OrderedService os =(OrderedService)CP_AOP_ANNOTATION_CTX.getBean("orderedService");
		os.order();
	}

}
