package com.autumn.zen.ioc.method;

public class ReplacedManager implements Manager {

	@Override
	public Car getCar() {
		Car car = new Car();
		car.setBrand("BMW");
		car.setPrice(200.00);
		return car;
	}

}
