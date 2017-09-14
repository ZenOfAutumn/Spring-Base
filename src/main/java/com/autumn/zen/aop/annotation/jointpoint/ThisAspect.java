package com.autumn.zen.aop.annotation.jointpoint;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ThisAspect {
	private static final Logger LOGGER = Logger.getLogger(ThisAspect.class);

	@Before("this(service)")
	public void log(ThisService service){
		LOGGER.info(service.getClass().getName());
	}
	
}
