package com.autumn.zen.ioc.annotation.autowire;

import java.util.Set;

import org.junit.Assert;

import com.autumn.zen.applocationContext.ApplicationContextCollection;
import com.google.common.collect.Sets;

public class App {

	public static void main(String[] args) {

		AutoWired autoWired = (AutoWired) ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(AutoWired.class);
		SingleBean sbInjected = autoWired.getSingleBean();
		SingleBean sbExpected = (SingleBean) ApplicationContextCollection.CP_IoC_ANNOTATION_CTX
				.getBean(SingleBean.class);
		Assert.assertTrue(sbInjected == sbExpected);

		MultiBeanInterface mbiInjected = autoWired.getMultiBeanInterface();
		MultiBeanInterface mbiExpected = (MultiBeanInterface) ApplicationContextCollection.CP_IoC_ANNOTATION_CTX
				.getBean("defaultMultiBean");
		Assert.assertTrue(mbiInjected == mbiExpected);

		Set<MultiBeanInterface> mbiSetInjected = Sets.newHashSet(
				ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBeansOfType(MultiBeanInterface.class).values());
		Set<MultiBeanInterface> mbiSetExpected = autoWired.getMultiBeans();
		Assert.assertTrue(mbiSetInjected.equals(mbiSetExpected));

		Assert.assertEquals(1+2,autoWired.calculate(1,2));
		
		Resources resources = ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean(Resources.class);
		Assert.assertTrue(mbiExpected==resources.getMultiBeanInterface());
		Assert.assertTrue(mbiExpected==resources.getDefaultMultiBean());
		Assert.assertTrue(sbExpected==resources.getSingleBean());
		
		Function add = (Function)ApplicationContextCollection.CP_IoC_ANNOTATION_CTX.getBean("add");
		Assert.assertTrue(add==resources.getAdd());
	}

}
