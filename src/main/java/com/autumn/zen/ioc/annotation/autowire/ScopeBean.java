package com.autumn.zen.ioc.annotation.autowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ScopeBean {
	
	public static final Logger LOGGER = Logger.getLogger(ScopeBean.class);
	
	@PostConstruct
	public void init(){
		LOGGER.info("after construct");
	}
	
	@PreDestroy
	public void destroy(){
		LOGGER.info("pre destroy");
	}
	
	

}
