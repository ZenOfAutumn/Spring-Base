package com.autumn.zen.aop.proxy.advice;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	private static final Logger LOGGER = Logger.getLogger(LogBeforeAdvice.class);
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		LOGGER.info(target.getClass().getName()+"."+method.getName()+" before process.");
	}

}
