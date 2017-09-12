package com.autumn.zen.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.autumn.zen.ioc.method.Car;

public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand(this.brand);
		car.setPrice(this.price);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
