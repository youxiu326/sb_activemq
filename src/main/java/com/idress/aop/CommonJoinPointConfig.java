package com.idress.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 切入点
 */
public class CommonJoinPointConfig {

    @Pointcut("execution(* com.idress.service.*.*(..))")
    public void saveExecution(){}
} 