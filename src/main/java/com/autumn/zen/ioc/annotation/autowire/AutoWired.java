package com.autumn.zen.ioc.annotation.autowire;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutoWired {

	// 类型匹配,容器中有且只有一个Bean时匹配成功
	@Autowired
	private SingleBean singleBean;

	// required=false:容器中找不到同类型Bean也不抛出NoSuchBeanDefinitionException
	@Autowired(required = false)
	private NotInjectBean notInjectBean;

	// Qualifier限定注入bean的名称
	@Autowired
	@Qualifier("defaultMultiBean")
	private MultiBeanInterface multiBeanInterface;

	// 将符合类型的所有Bean注入集合
	@Autowired(required = false)
	private Set<MultiBeanInterface> multiBeans;

	private Function function;

	// 类方法参数注入
	@Autowired
	private void setFunction(@Qualifier("add") Function f) {
		this.function = f;
	}

	public SingleBean getSingleBean() {
		return singleBean;
	}

	public NotInjectBean getNotInjectBean() {
		return notInjectBean;
	}

	public MultiBeanInterface getMultiBeanInterface() {
		return multiBeanInterface;
	}

	public Set<MultiBeanInterface> getMultiBeans() {
		return multiBeans;
	}

	public long calculate(int x, int y) {
		return function.apply(x, y);
	}

}
