
/**
 * 
 * xmlns:context="http://www.springframework.org/schema/context"
 * xsi:schemaLocation="
 *	   http://www.springframework.org/schema/context
 *	   http://www.springframework.org/schema/context/spring-context-4.1.xsd"
 *
 *<context:component-scan base-package="com.autumn.zen.ioc.annotation">
		<context:include-filter type=""
			expression="" />
		<context:exclude-filter type=""
			expression="" />
	</context:component-scan>
 * 
 * 
 * context filter type:
 * 
 * 1.type="annotation" expression="com.autumn.zen.ioc.annotation.Scan"
 * 根据是否标注了该注解进行过滤
 * 2.type="assignable" expression="com.autumn.zen.ioc.annotation.ScanService"
 * 根据是否继承和扩展了特定类进行过滤
 * 3.type="aspectj" expression="com.autumn.zen.ioc.annotation..*Service+"
 * 所有类名以Service结束及继承或扩展它们的类,采用AspectJ过滤
 * 4.type="regex" expression="com\.autumn\.zen\.ioc\.annotation\.。*Service"
 * 通过正则表达式根据类名称进行过滤
 * 5.type="custom" expression="com.autumn.zen.ioc.annotation.IncludeTypeFilter"
 * 通过实现TypeFilter的类规则进行过滤
 * 
 * 自动装配
 * 
 * byName:根据名称装配
 * 
 * byType:根据类型装配
 * 
 * constructor:在构造器中按照类型装配
 * 
 * autodetect：有默认构造函数，则采用byType，否则采用constructor
 * 
 * 
 */

package com.autumn.zen.ioc.annotation;

