package com.autumn.zen.aop.schema;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class SchemaBeforeAdvice implements MethodBeforeAdvice {
	
	private static final Logger LOGGER = Logger.getLogger(SchemaBeforeAdvice.class);

	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		LOGGER.info("before schema advice: " + method.getName());
	}
}
