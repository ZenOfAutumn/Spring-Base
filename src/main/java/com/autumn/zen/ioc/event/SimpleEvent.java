package com.autumn.zen.ioc.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class SimpleEvent extends ApplicationContextEvent {

	private static final long serialVersionUID = 5480816098452199072L;
	
	String msg;
	
	public String getMsg() {
		return msg;
	}
	
	public SimpleEvent(ApplicationContext source,String msg) {
		super(source);
		this.msg = msg;
		
	}

	
	

}
