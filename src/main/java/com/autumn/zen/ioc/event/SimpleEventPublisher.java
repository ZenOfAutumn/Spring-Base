package com.autumn.zen.ioc.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SimpleEventPublisher implements ApplicationContextAware {
	
	private  ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void publish(String msg){
		SimpleEvent event = new SimpleEvent(applicationContext, msg);
		applicationContext.publishEvent(event);
	}
	
}
