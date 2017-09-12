package com.autumn.zen.ioc.annotation.filter.custom;

import java.util.Map;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	public static void main(String[] args) {
		CustomScanBean scan = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(CustomScanBean.class);
		Assert.assertNotNull(scan);
		Map<String, CustomNotScanBean> notScan =  ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(CustomNotScanBean.class);
		Assert.assertTrue(notScan.isEmpty());
	}
}
