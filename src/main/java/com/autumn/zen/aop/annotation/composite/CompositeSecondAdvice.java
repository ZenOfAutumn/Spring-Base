package com.autumn.zen.aop.annotation.composite;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Composite First Advice
 *
 * @author zhikong.wl
 * @date 2017-10-10 10:59
 **/
public class CompositeSecondAdvice {

    private static final Logger LOGGER = Logger.getLogger(CompositeSecondAdvice.class);

    public void secondProcess(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        CompositeAnnotation compositeAnnotation = signature.getMethod().getAnnotation(CompositeAnnotation.class);
        LOGGER.info(compositeAnnotation.value());
        LOGGER.info(ThreadContextUtils.getName());
    }


}
