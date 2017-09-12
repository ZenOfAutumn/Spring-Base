package com.autumn.zen.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.autumn.zen.aop.proxy.PerformanceMonitor;

public class PerformanceHandler implements InvocationHandler {

	private Object target;
	
	public PerformanceHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
		Object result = method.invoke(target, args);
		PerformanceMonitor.end();
		return result;
	}

}
