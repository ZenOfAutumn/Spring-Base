package com.autumn.zen.aop.annotation.jointpoint;

import org.springframework.stereotype.Component;

@Component
public class ReturnAspectService {
	
	public Integer getInt(){
		return 0;
	}
	
	public String getStr(){
		return "1";
	}
	
	public void throwEx()throws RuntimeException{
		throw new RuntimeException("exception runtime");
	}
	

}
