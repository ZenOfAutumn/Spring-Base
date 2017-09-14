package com.autumn.zen.aop.annotation.complex;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ComplexAspect {

	private static final Logger LOGGER = Logger.getLogger(ComplexAspect.class);

	@Before(" within(com.autumn.zen.aop.annotation.complex.*) && execution(* log*(..)) ")
	public void logBefore() {
		LOGGER.info(" and log function");
	}
	
	@After("!target(com.autumn.zen.aop.annotation.complex.ComplexService) and within(com.autumn.zen.aop.annotation.complex.*)")
	public void logNot(){
		LOGGER.info(" not complex service");
	}
	
	@AfterReturning("target(com.autumn.zen.aop.annotation.complex.ComplexService) || execution(* log*(..))")
	public void logOr(){
		LOGGER.info(" or log function ");
	}
	
	
	
	
	
}
