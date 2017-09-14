package com.autumn.zen.aop.annotation.order;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class OrderedService {

	private static final Logger LOGGER = Logger.getLogger(OrderedService.class);

	public void order() {
		LOGGER.info("order processing.........");
	}

	public void sort() {
		LOGGER.info("sort processing.........");

	}
}
