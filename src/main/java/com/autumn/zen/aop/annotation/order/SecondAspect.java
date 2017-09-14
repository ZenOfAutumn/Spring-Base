package com.autumn.zen.aop.annotation.order;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecondAspect implements Ordered {

	private static final Logger LOGGER = Logger.getLogger(SecondAspect.class);

	
	@Override
	public int getOrder() {
		return 1;
	}
	
	@Before("target(com.autumn.zen.aop.annotation.order.OrderedService)")
	public void logBeforeFirst() {
		LOGGER.info("second aspect first log");
	}
	
	@Before("target(com.autumn.zen.aop.annotation.order.OrderedService)")
	public void logBeforeSecond() {
		LOGGER.info("second aspect second log");
	}
	
	

}
