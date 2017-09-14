package com.autumn.zen.aop.proxy.advice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
	public static final ClassPathXmlApplicationContext CLASS_PATH_AOP_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Advice.xml");

	public static void main(String[] args) {
		// Before Advice
		AopService aop = AdviceFactory.getAopProxyService(new AopServiceImpl(), new LogBeforeAdvice());
		aop.map();
		aop.reduce();
		
		AopService aopService = (AopService)CLASS_PATH_AOP_CTX.getBean("aopLogBeforeAdvice");
		aopService.map();
		aopService.reduce();
		
		// Introduction Interceptor
		AopService aopLogIntroductionAdvice = (AopService)CLASS_PATH_AOP_CTX.getBean("aopLogIntroductionAdvice");
		LogIntroductionService logService = (LogIntroductionService)aopLogIntroductionAdvice;
		logService.log();
		
	}

}
