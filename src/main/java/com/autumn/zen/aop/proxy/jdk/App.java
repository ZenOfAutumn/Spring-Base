package com.autumn.zen.aop.proxy.jdk;

public class App {

	public static void main(String[] args) {
		
		ProxiedService ps = ProxyFactory.createProxy();
		ps.delay(200);
		ps.sleep(500);
		
	}
}
