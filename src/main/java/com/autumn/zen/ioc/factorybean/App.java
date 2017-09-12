package com.autumn.zen.ioc.factorybean;

import org.apache.log4j.Logger;

import com.autumn.zen.applocationContext.ApplicationContextCollection;
import com.autumn.zen.ioc.method.Car;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {

		Car benzI = (Car)ApplicationContextCollection.CLASS_PATH_CTX.getBean("benzCarFactory");
		Car benzII = (Car)ApplicationContextCollection.CLASS_PATH_CTX.getBean("benzCarFactory");
		LOGGER.info("benzI == benzII? " + (benzI==benzII));
	}
}
