package com.autumn.zen.ioc.annotation.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
// 导入其他Configuration配置
@Import(DaoConfig.class)
// 导入XML定义的Bean
@ImportResource("classpath:Application-Context-IoC-Base.xml")
public class ServiceConfig {
	
	
	@Autowired
	private DriverDao driverDao;
	
	@Autowired
	private CarDao carDao;
	
	@Bean
	public DriveService driveService(){
		DriveService ds = new DriveService();
		ds.setCarDao(carDao);
		ds.setDriverDao(driverDao);
		return ds;
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public DriveService scopeDriveService(){
		DriveService ds = new DriveService();
		ds.setCarDao(carDao);
		ds.setDriverDao(driverDao);
		return ds;
	}
	
	

}
