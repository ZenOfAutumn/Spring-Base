package com.autumn.zen.aop.annotation;

import org.apache.log4j.Logger;


public class LogServiceImpl implements LogService {

	private static final Logger LOGGER = Logger.getLogger(LogServiceImpl.class);

	
	@Override
	public void logName() {
		LOGGER.info(this.getClass().getName());
	}

}
