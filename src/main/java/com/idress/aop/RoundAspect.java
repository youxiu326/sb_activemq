package com.idress.aop;

import com.idress.entity.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(100)
public class RoundAspect {

    @Around("execution(* com.idress.service.*.test01(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("执行方法前");
        Object obj = pjp.proceed();
        System.out.println("执行方法后");
        return  obj;
    }

    @Around("execution(* com.idress.service.*.test02(..))")
    public Object around2(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("执行test02方法前");
        Object[] args = pjp.getArgs();//执行方法前的方法参数
        Object obj = pjp.proceed(args);//执行方法后的方法返回值
        Student stu = (Student) obj;
        System.out.println(stu.getName());
        return  obj;
    }


} 