package com.autumn.zen.ioc.event;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;

public class SimpleEventListener implements ApplicationListener<SimpleEvent> {

	private static final Logger LOGGER = Logger.getLogger(SimpleEventListener.class);

	@Override
	public void onApplicationEvent(SimpleEvent event) {
		LOGGER.info("simple event msg is: " + event.getMsg());
	}

}
