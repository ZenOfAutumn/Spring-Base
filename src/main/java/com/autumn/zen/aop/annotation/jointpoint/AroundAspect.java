package com.autumn.zen.aop.annotation.jointpoint;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {

	private static final Logger LOGGER = Logger.getLogger(AroundAspect.class);

	@Around("target(com.autumn.zen.aop.annotation.jointpoint.JointPointService)")
	public void logAround(ProceedingJoinPoint pjp) {
		LOGGER.info(pjp.getStaticPart().getSignature().toLongString());
		for (int i = 0; i < pjp.getArgs().length; i++) {
			LOGGER.info("arg: " + pjp.getArgs()[i]);
		}
		Object ret = null;
		try {
			 ret = pjp.proceed();
		} catch (Throwable e) {
			LOGGER.error(e);
		}
		LOGGER.info("return value: " + ret);
	}
	

}
