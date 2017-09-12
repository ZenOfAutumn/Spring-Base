package com.autumn.zen.ioc.property;

import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static final ClassPathXmlApplicationContext CLASS_PATH_PROPERTY_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-Property.xml");

	
	public static void main(String[] args) {
		
		XmlPropertyBean xmlPB = (XmlPropertyBean)CLASS_PATH_PROPERTY_CTX.getBean("xmlPropertyBean");
		Assert.assertEquals(1,xmlPB.getIntValue());
		Assert.assertEquals("xml",xmlPB.getStrValue());
		
		XmlPropertyBean xmlCopyPB = (XmlPropertyBean)CLASS_PATH_PROPERTY_CTX.getBean("xmlCopyPropertyBean");
		Assert.assertEquals(1,xmlCopyPB.getIntValue());
		Assert.assertEquals("xml",xmlCopyPB.getStrValue());
		
		AnnotationPropertyBean aPB = (AnnotationPropertyBean)CLASS_PATH_PROPERTY_CTX.getBean("annotationPropertyBean");
		Assert.assertEquals(2,aPB.getIntValue());
		Assert.assertEquals("annotation",aPB.getStrValue());
		
	}
}
