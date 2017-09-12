package com.autumn.zen.aop.proxy;

import org.apache.log4j.Logger;

public class MethodPerformance {

	private static final Logger LOGGER = Logger.getLogger(MethodPerformance.class);
	
	private long begin;
	
	private long end;
	
	private String method;
	
	public MethodPerformance(String method) {
		this.method = method;
		this.begin = System.currentTimeMillis();
	}
	
	public void log(){
		this.end = System.currentTimeMillis();
		long elapse = end-begin;
		LOGGER.info(method + " taked " + elapse + " ms");
	}
	
	
	
}
