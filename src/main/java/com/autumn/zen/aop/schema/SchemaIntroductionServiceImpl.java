package com.autumn.zen.aop.schema;

import org.apache.log4j.Logger;

public class SchemaIntroductionServiceImpl implements SchemaIntroductionService {

	private static final Logger LOGGER = Logger.getLogger(SchemaIntroductionServiceImpl.class);

	@Override
	public void intro() {
		LOGGER.info("intro method");
	}

}
