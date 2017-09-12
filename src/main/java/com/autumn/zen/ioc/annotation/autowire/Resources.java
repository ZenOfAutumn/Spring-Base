package com.autumn.zen.ioc.annotation.autowire;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * 
 *  @Resource装配顺序   
 *
 * 1. 如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常   
 * 2. 如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常   
 * 3. 如果指定了type，则从上下文中找到类型匹配的唯一bean进行装配，找不到或者找到多个，都会抛出异常     
 * 4. 如果既没有指定name，又没有指定type，则自动按照byName方式进行装配（见2）；如果没有匹配，则回退为一个原始类型（InjectionDAO）进行匹配，如果匹配则自动装配；
 *   
 *
 */

@Component
public class Resources {
	
	// 1.By Name And Type
	@Resource(name="defaultMultiBean",type = MultiBeanInterface.class)
	private MultiBeanInterface multiBeanInterface;
	
	// 2.By Name
	@Resource(name="defaultMultiBean")
	private MultiBeanInterface defaultMultiBean;
	
	// 3.By Type
	@Resource(type=SingleBean.class)
	private SingleBean singleBean;
	
	// 4.Default By Name
	@Resource
	private Function add;

	public MultiBeanInterface getMultiBeanInterface() {
		return multiBeanInterface;
	}

	public MultiBeanInterface getDefaultMultiBean() {
		return defaultMultiBean;
	}

	public SingleBean getSingleBean() {
		return singleBean;
	}

	public Function getAdd() {
		return add;
	}
	

}
