package com.autumn.zen.ioc.scope;

import org.apache.log4j.Logger;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {

		SingletonBean singletonI = (SingletonBean) ApplicationContextCollection.CLASS_PATH_CTX.getBean("singleton");
		SingletonBean singletonII = (SingletonBean) ApplicationContextCollection.CLASS_PATH_CTX.getBean("singleton");
		LOGGER.info("singletonI == singletonII? " + (singletonI == singletonII));

		PrototypeBean protoI = (PrototypeBean) ApplicationContextCollection.CLASS_PATH_CTX.getBean("prototype");
		PrototypeBean protoII = (PrototypeBean) ApplicationContextCollection.CLASS_PATH_CTX.getBean("prototype");
		LOGGER.info("protoI == protoII? " + (protoI == protoII));

	}

}
