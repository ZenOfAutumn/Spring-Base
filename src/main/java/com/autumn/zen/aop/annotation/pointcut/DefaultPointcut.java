package com.autumn.zen.aop.annotation.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class DefaultPointcut {

	@Pointcut(" within(com.autumn.zen.aop.annotation.complex.*) && execution(* log*(..)) ")
	private void logBefore(){};
	
	@Pointcut("!target(com.autumn.zen.aop.annotation.complex.ComplexService")
	protected void logNot(){};
	
	@Pointcut(" logBefore() and logNot()")
	public void logNotAndBefore(){};
	
	
}
