package com.autumn.zen.aop.proxy.advisor;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class StaticServiceLogAdvisor extends StaticMethodMatcherPointcut {
	

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if(method.getModifiers()==Modifier.PUBLIC){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				if(clazz.getSimpleName().contains("Service")){
					return true;
				}else{
					return false;
				}
			}
		};
	}
}
