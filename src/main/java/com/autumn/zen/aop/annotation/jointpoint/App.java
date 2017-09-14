
package com.autumn.zen.aop.annotation.jointpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static final ClassPathXmlApplicationContext CP_AOP_ANNOTATION_CTX = new ClassPathXmlApplicationContext(
			"classpath:Application-Context-AOP-Annotation.xml");

	public static void main(String[] args) {
		JointPointService os = (JointPointService) CP_AOP_ANNOTATION_CTX.getBean("jointPointService");
		os.joint("hello", 2);
		os.point(1.2, 2.3);
		os.args("world", 3, 3);

		ThisService ts = (ThisService) CP_AOP_ANNOTATION_CTX.getBean("thisService");
		ts.call();
		
		ReturnAspectService rs = (ReturnAspectService)CP_AOP_ANNOTATION_CTX.getBean("returnAspectService");
		rs.getInt();
		rs.getStr();
		rs.throwEx();
	}

}
