package com.autumn.zen.ioc.method;

import org.apache.log4j.Logger;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {

		Manager manager = (Manager) ApplicationContextCollection.CLASS_PATH_CTX.getBean("wl");
		LOGGER.info("look-up method insert: " + manager.getCar());
		LOGGER.info("prototype return is same: " + (manager.getCar() == manager.getCar()));
	
		Manager replacedManager = (Manager) ApplicationContextCollection.CLASS_PATH_CTX.getBean("replacedManager");
		LOGGER.info("replaced manager: " + replacedManager.getCar());

	}
}
