package com.autumn.zen.aop.annotation.composite;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Composite First Advice
 *
 * @author zhikong.wl
 * @create 2017-10-10 10:59
 **/
public class CompositeFirstAdvice {

    private static final Logger LOGGER = Logger.getLogger(CompositeFirstAdvice.class);

    public void firstProcess(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        CompositeAnnotation compositeAnnotation = signature.getMethod().getAnnotation(CompositeAnnotation.class);
        LOGGER.info(compositeAnnotation.value());
        ThreadContextUtils.setName("composite aspect.");
    }


}
