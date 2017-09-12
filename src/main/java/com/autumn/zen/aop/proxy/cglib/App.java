package com.autumn.zen.aop.proxy.cglib;

import com.autumn.zen.aop.proxy.jdk.ProxiedService;
import com.autumn.zen.aop.proxy.jdk.ProxiedServiceImpl;

public class App {

	public static void main(String[] args) {
		ProxiedService ps = (ProxiedService)CglibProxy.getProxy(ProxiedServiceImpl.class);
		ps.delay(300);
		ps.delay(500);
	}
}
