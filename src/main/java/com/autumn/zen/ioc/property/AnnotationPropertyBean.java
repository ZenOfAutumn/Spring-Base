package com.autumn.zen.ioc.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationPropertyBean {
	
	@Value("${annotationInitValue}")
	private int intValue;
	
	@Value("${annotationStrValue}")
	private String strValue;
	
	public int getIntValue() {
		return intValue;
	}
	
	public String getStrValue() {
		return strValue;
	}
	
	

}
