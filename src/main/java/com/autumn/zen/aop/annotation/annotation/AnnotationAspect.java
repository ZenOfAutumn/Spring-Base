package com.autumn.zen.aop.annotation.annotation;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AnnotationAspect {
	
	private static final Logger LOGGER = Logger.getLogger(AnnotationAspect.class);

	
	@AfterReturning("@annotation(com.autumn.zen.aop.annotation.annotation.AfterReturnLog)")
	public void logAfter(){
		LOGGER.info(" after return value");
	}
	

}
