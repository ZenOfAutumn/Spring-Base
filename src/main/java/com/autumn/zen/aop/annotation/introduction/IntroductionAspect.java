package com.autumn.zen.aop.annotation.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.autumn.zen.aop.annotation.LogService;
import com.autumn.zen.aop.annotation.LogServiceImpl;

@Aspect
@Component
public class IntroductionAspect {

	@DeclareParents(value="com.autumn.zen.aop.annotation.StreamServiceImpl",defaultImpl=LogServiceImpl.class)
	public LogService logService; 
}
