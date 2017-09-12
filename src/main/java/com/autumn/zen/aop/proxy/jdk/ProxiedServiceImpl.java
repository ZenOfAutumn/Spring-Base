package com.autumn.zen.aop.proxy.jdk;

public class ProxiedServiceImpl implements ProxiedService {

	
	@Override
	public void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
