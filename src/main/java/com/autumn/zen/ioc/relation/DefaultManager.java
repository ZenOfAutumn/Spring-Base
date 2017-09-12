package com.autumn.zen.ioc.relation;

import com.autumn.zen.ioc.method.Car;
import com.autumn.zen.ioc.method.Manager;

public class DefaultManager implements Manager {

	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public Car getCar() {
		return car;
	}
}
