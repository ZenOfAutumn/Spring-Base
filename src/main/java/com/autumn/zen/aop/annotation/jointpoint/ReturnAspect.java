package com.autumn.zen.aop.annotation.jointpoint;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ReturnAspect {

	private static final Logger LOGGER = Logger.getLogger(ReturnAspect.class);

	@AfterReturning(value = "target(com.autumn.zen.aop.annotation.jointpoint.ReturnAspectService)", returning = "retValue")
	public void logRet(Object retValue) {
		LOGGER.info("return value is: " + retValue);
	}
	
	@AfterThrowing(value = "target(com.autumn.zen.aop.annotation.jointpoint.ReturnAspectService)", throwing = "ex")
	public void logExc(Throwable ex) {
		LOGGER.info("catch exception: " + ex.getMessage());
	}
	
	
}
