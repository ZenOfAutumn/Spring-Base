package com.autumn.zen.aop.proxy.advice;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturnAdvice implements AfterReturningAdvice{
	
	private static final Logger LOGGER = Logger.getLogger(LogAfterReturnAdvice.class);

	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		LOGGER.info(target.getClass().getName()+"."+method.getName()+" after process,retrun value is: " + returnValue);
	}

	
}
