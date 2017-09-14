package com.autumn.zen.aop.proxy.advice;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class LogAroundAdvice implements MethodInterceptor {

	private static final Logger LOGGER = Logger.getLogger(LogAroundAdvice.class);
	
	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		LOGGER.info(target.getClass().getName()+"."+method.getName()+" before process.");
		Object returnValue = method.invoke(target,args);
		LOGGER.info(target.getClass().getName()+"."+method.getName()+" after process,retrun value is: " + returnValue);
		return returnValue;
	}

}
