package com.autumn.zen.aop.proxy.advice;

import java.lang.reflect.Method;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class LogThrowsAdvice implements ThrowsAdvice {

	private static final Logger LOGGER = Logger.getLogger(LogThrowsAdvice.class);

	
	public void afterThrowing(SQLException ex){
		LOGGER.info(ex.getClass().getName()+":"+ex.getMessage());
	}
	
	public void afterThrowing(Method method,Object[] args,Object target,Exception ex){
		LOGGER.info(target.getClass().getName()+"."+method.getName()+" catch exception: "+ ex.getClass().getName()+"-"+ex.getMessage());
	}
	
	
}
