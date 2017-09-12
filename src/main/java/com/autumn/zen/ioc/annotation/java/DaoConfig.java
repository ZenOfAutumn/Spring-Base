package com.autumn.zen.ioc.annotation.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
	
	// 方法名为Bean的Id,默认单例模式，每次返回相同Bean
	@Bean
	public CarDao carDao(){
		CarDao dao = new CarDao();
		return dao;
	}
	
	@Bean
	public DriverDao driverDao(){
		DriverDao driverDao = new DriverDao();
		return driverDao;
	}
	
	

}
