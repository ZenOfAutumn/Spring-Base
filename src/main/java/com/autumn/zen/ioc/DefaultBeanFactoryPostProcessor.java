package com.autumn.zen.ioc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DefaultBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private static final Logger LOGGER = Logger.getLogger(DefaultBeanFactoryPostProcessor.class);

	private String classPattern;

	public String getClassPattern() {
		return classPattern;
	}

	public void setClassPattern(String classPattern) {
		this.classPattern = classPattern;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		LOGGER.info("default bean factory post process");
		
		beanFactory.addBeanPostProcessor(new BeanPostProcessor() {

			@Override
			public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
				Matcher matcher = Pattern.compile(classPattern).matcher(beanName);
				if (matcher.matches()) {
					LOGGER.info(bean.getClass().getName() + " matched bean factory post process before initialization");
				}
				return bean;
			}

			@Override
			public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

				Matcher matcher = Pattern.compile(classPattern).matcher(beanName);
				if (matcher.matches()) {
					LOGGER.info(bean.getClass().getName() + " matched bean factory post process after initialization");
				}
				return bean;
			}
		});
	}

}
