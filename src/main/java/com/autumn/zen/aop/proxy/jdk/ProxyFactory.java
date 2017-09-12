package com.autumn.zen.aop.proxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	public static ProxiedService createProxy(){
		ProxiedService ps = new ProxiedServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(ps);
		ProxiedService proxy = (ProxiedService)Proxy.newProxyInstance(ps.getClass().getClassLoader(), ps.getClass().getInterfaces(), handler);
		return proxy;		
	}
	

}
