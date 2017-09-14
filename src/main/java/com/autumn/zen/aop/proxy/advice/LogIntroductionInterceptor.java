package com.autumn.zen.aop.proxy.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LogIntroductionInterceptor extends DelegatingIntroductionInterceptor implements LogIntroductionService{
	
	private static final long serialVersionUID = -7398625169370067571L;
	
	private static final Logger LOGGER = Logger.getLogger(LogIntroductionInterceptor.class);


	@Override
	public void log() {
		LOGGER.info(this.getClass().getName());
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
	    return super.invoke(mi);
	}

	
}
