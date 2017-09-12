package com.autumn.zen.ioc.annotation.filter.custom;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class IncludeTypeFilter implements TypeFilter {
	
	private static final Logger LOGGER = Logger.getLogger(IncludeTypeFilter.class);
	
	private String classNamePart = "Scan";
	
	public String getClassNamePart() {
		return classNamePart;
	}
	
	public void setClassNamePart(String classNamePart) {
		this.classNamePart = classNamePart;
	}

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		String className = metadataReader.getClassMetadata().getClassName();
		LOGGER.info("class name include filter is: " + className);
		if(className.contains(this.classNamePart)){
			return true;
		}else{
			return false;
		}
	}

}
