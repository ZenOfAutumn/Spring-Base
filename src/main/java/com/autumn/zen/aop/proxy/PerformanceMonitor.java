package com.autumn.zen.aop.proxy;


public class PerformanceMonitor {

	private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();
	
	
	public static void begin(String method){
		MethodPerformance mp = new MethodPerformance(method);
		performanceRecord.set(mp);
	}
	
	public static void end(){
		MethodPerformance mp = performanceRecord.get();
		mp.log();
	}
}
