package com.autumn.zen.ioc;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CompletableBean implements  BeanNameAware, BeanFactoryAware,
		InitializingBean, DisposableBean {

	private static final Logger LOGGER = Logger.getLogger(CompletableBean.class);

	private String id;

	private String name;

	private BeanFactory beanFactory;

	private String beanName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public String getBeanName() {
		return beanName;
	}


	// BeanFactoryAware接口方法
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		LOGGER.info("bean factory set");
		this.beanFactory = beanFactory;
	}


	// BeanNameAware接口方法
	public void setBeanName(String name) {
		LOGGER.info("set bean name: " + name);
		this.name = name;
	}

	// InitializingBean接口方法
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("after propertys set");
		LOGGER.info(this.toString());
	}

	// DisposableBean接口方法
	public void destroy() throws Exception {
		LOGGER.info("bean destroy");
	}

	// init-method 配置
	public void iinit() {
		LOGGER.info("bean init method");
	}

	// destroy-method 配置
	public void idestroy() {
		LOGGER.info("bean destroy method");
	}
	
	


}
