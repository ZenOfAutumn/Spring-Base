package com.autumn.zen.ioc.annotation.filter.assignable;

import java.util.Map;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	public static void main(String[] args) {
		ScanServiceBean scan = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(ScanServiceBean.class);
		Assert.assertNotNull(scan);
		Map<String, NotScanServiceBean> notScan =  ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(NotScanServiceBean.class);
		Assert.assertTrue(notScan.isEmpty());
	}
}
