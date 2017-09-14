
/**
 * 增强(Advice)
 * 1.前置增强(BeforeAdvice) MethodBeforeAdvice 
 * 2.后置增强 (AfterAdvice) AfterReturningAdvice
 * 3.环绕增强(Interceptor) MethodInterceptor
 * 4.异常抛出增强(AfterAdvice) ThrowsAdvice
 * 5.引介增强(Interceptor) IntroductionInterceptor
 *
 * 切点(PointCut)
 * -ClassFilter 定位到具体类上
 * -MethodMatcher 定位到具体方法上
 * 1.StaticMethodMatcherPointcut 静态方法切点：NameMatchMethodPointcut和AbstractRegexpMethodPointcut
 * 2.DeclareParentsAdvisor和DynamicMethodMatcherPointcut 动态方法切点
 * 3.AnnotationMatchingPointcut 注解切点
 * 4.ExpressionPointcut 表达式切点
 * 5.ControlFlowPointcut 流程切点
 * 6.ComposablePointcut 复合切点
 * 
 * 切面(Advisor)
 * 1.Advisor 一般切面(仅包含一个Advice)
 * 2.PointcutAdvisor 具有切点的切面(包含Advice和Pointcut)
 * 3.IntroductionAdvisor 代表引介切面(包含ClassFilter)
 * 
 */
package com.autumn.zen.aop.proxy.advice;

