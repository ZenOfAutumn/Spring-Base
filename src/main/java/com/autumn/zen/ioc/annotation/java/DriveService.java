package com.autumn.zen.ioc.annotation.java;

public class DriveService {

	
	private DriverDao driverDao;
	
	private CarDao carDao;
	
	public DriverDao getDriverDao() {
		return driverDao;
	}
	
	public void setDriverDao(DriverDao driverDao) {
		this.driverDao = driverDao;
	}
	
	public CarDao getCarDao() {
		return carDao;
	}
	
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
}
