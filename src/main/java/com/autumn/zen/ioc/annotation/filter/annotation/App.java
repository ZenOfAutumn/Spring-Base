package com.autumn.zen.ioc.annotation.filter.annotation;

import java.util.Map;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	public static void main(String[] args) {
		ScanBean scan = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(ScanBean.class);
		Assert.assertNotNull(scan);
		Map<String, NotScanBean> notScan =  ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(NotScanBean.class);
		Assert.assertTrue(notScan.isEmpty());
	}
}
