package com.autumn.zen.aop.annotation.execution;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExecutionAspect {

	private static final Logger LOGGER = Logger.getLogger(ExecutionAspect.class);

	@AfterReturning("execution(public void *(Object+))")
	public void logAfterObjectArgAndVoidReturn(){
		LOGGER.info("this is a object arg and void return method");
	}
	
}
