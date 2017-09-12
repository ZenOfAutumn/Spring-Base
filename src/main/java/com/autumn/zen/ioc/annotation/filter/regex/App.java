
package com.autumn.zen.ioc.annotation.filter.regex;

import java.util.Map;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;

public class App {

	public static void main(String[] args) {
		RegexScanBean scan = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(RegexScanBean.class);
		Assert.assertNotNull(scan);
		Map<String, RegexNotScanBean> notScan =  ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(RegexNotScanBean.class);
		Assert.assertTrue(notScan.isEmpty());
	
	}
}
