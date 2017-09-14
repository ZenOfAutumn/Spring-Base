package com.autumn.zen.aop.schema;

import org.apache.log4j.Logger;

public class SchemaLogAdvice {

	private static final Logger LOGGER = Logger.getLogger(SchemaLogAdvice.class);

	public void logBefore() {
		LOGGER.info("before schema service process");
	}

	public void logAfter() {
		LOGGER.info("after schema service process");
	}

	public void logAfterReturn(Object retVal) {
		LOGGER.info("return value: " + retVal);

	}

}
