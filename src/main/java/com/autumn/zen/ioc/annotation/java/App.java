package com.autumn.zen.ioc.annotation.java;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	
	public static void main(String[] args) {
		
		ServiceConfig sc = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(ServiceConfig.class);
		DriveService dsFirst = sc.driveService();
		DriveService dsSecond = sc.driveService();
		Assert.assertTrue(dsFirst==dsSecond);
		
		DriveService  scopeDSFirst = sc.scopeDriveService();
		DriveService  scopeDSSecond = sc.scopeDriveService();
		Assert.assertTrue(scopeDSFirst != scopeDSSecond);
		
	}
}
