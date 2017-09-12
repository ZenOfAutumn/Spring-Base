
package com.autumn.zen.ioc.event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static final ClassPathXmlApplicationContext CLASS_PATH_EVENT_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-Event.xml");

	public static void main(String[] args) {
		SimpleEventPublisher simpleEventPublisher = (SimpleEventPublisher) CLASS_PATH_EVENT_CTX
				.getBean("simpleEventPublisher");
		simpleEventPublisher.publish("hello world");
	}

}
