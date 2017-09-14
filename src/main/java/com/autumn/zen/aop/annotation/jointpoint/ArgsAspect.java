package com.autumn.zen.aop.annotation.jointpoint;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArgsAspect {

	private static final Logger LOGGER = Logger.getLogger(ArgsAspect.class);

	@Before("target(com.autumn.zen.aop.annotation.jointpoint.JointPointService) and args(arg1,arg2,arg3)")
	public void argsBind(String arg1, int arg2,int arg3) {
		LOGGER.info("function args: " + arg1 + "," + arg2 + "," + arg3);
	}

}
