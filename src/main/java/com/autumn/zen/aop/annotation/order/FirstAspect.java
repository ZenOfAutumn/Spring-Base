package com.autumn.zen.aop.annotation.order;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FirstAspect implements Ordered {

	private static final Logger LOGGER = Logger.getLogger(FirstAspect.class);

	
	@Override
	public int getOrder() {
		return 0;
	}
	
	@Before("target(com.autumn.zen.aop.annotation.order.OrderedService)")
	public void logBeforeFirst() {
		LOGGER.info("first aspect first log");
	}
	
	@Before("target(com.autumn.zen.aop.annotation.order.OrderedService)")
	public void logBeforeSecond() {
		LOGGER.info("first aspect second log");
	}
	
	

}
