package com.autumn.zen.ioc;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DefaultBeanPostProcessor implements BeanPostProcessor {

	private static final Logger LOGGER = Logger.getLogger(DefaultBeanPostProcessor.class);

	private Class<?> target;

	public void setTarget(Class<?> target) {
		this.target = target;
	}

	public Class<?> getTarget() {
		return target;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (bean.getClass().isAssignableFrom(target)) {
			LOGGER.info(bean.getClass().getName() + " processed by default bean before initialize");

		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().isAssignableFrom(target)) {
			LOGGER.info(bean.getClass().getName() + " process by default bean after initialize");
		}
		return bean;
	}

	public static void main(String[] args) {

		if (args[0] instanceof String) {

		}
	}

}
