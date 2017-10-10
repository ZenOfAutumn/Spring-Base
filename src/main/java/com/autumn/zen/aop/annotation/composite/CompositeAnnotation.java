package com.autumn.zen.aop.annotation.composite;

import java.lang.annotation.*;

/**
 * Composite Annotation
 *
 * @author zhikong.wl
 * @create 2017-10-10 11:07
 **/
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CompositeAnnotation {

    String value() default "";

}
