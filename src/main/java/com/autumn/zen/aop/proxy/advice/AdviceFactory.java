package com.autumn.zen.aop.proxy.advice;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class AdviceFactory {

	public static AopService getAopProxyService(AopService aop, Advice advice) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(aop);
		pf.addAdvice(advice);
		AopService proxy = (AopService) pf.getProxy();
		return proxy;
	}
}
