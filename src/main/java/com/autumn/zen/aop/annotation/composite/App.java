
package com.autumn.zen.aop.annotation.composite;

import com.autumn.zen.aop.annotation.complex.ComplexService;
import com.autumn.zen.aop.annotation.complex.NotComplexService;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	private static final ClassPathXmlApplicationContext CP_AOP_SCHEMA_CTX = new ClassPathXmlApplicationContext(
		"classpath:Application-Context-AOP-Schema.xml");

	public static void main(String[] args) {
		CompositeBean compositeBean = (CompositeBean) CP_AOP_SCHEMA_CTX.getBean("compositeBean");
		compositeBean.concat();
	}


}
