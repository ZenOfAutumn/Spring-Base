package com.autumn.zen.aop.annotation.jointpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ThisService {
	
	@Value("self")
	private String name;
	public String getName() {
		return name;
	}
	
	
	public void call(){}
}
