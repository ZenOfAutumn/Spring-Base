package com.autumn.zen.aop.proxy.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class DynamicServiceLogAdvisor extends DynamicMethodMatcherPointcut {

	private int argsMin;
	
	public void setArgsMin(int argsMin) {
		this.argsMin = argsMin;
	}
	
	public int getArgsMin() {
		return argsMin;
	}
	
	
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		if(args.length>argsMin){
			return true;
		}else{
			return false;
		}
	}

}
