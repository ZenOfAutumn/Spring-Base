package com.autumn.zen.aop.proxy.advisor;

import org.springframework.aop.IntroductionInfo;

import com.autumn.zen.aop.proxy.advice.AopService;

public class IntroductionAdvice implements IntroductionInfo {

	@Override
	public Class<?>[] getInterfaces() {
		return new Class[] { AopService.class };
	}

}
