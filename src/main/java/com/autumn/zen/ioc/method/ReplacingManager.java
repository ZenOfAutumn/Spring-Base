package com.autumn.zen.ioc.method;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacingManager implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		Car car = new Car();
		car.setBrand("Toyota");
		car.setPrice(10.00);
		return car;
	}

}
