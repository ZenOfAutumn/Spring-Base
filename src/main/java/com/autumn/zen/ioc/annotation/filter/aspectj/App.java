package com.autumn.zen.ioc.annotation.filter.aspectj;

import java.util.Map;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	public static void main(String[] args) {
		AspectJScanService scan = (AspectJScanService) ApplicationContextCollection.CP_IoC_ANNOTATION_CTX
				.getBean("aspectJScanService");
		Assert.assertNotNull(scan);
		Map<String, AspectJNotScanBean> notScan = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(AspectJNotScanBean.class);
		Assert.assertTrue(notScan.isEmpty());
	}
}
