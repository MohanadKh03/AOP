package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAspect {

    @Before("execution(String com.example.aop.test..*.*(..))")
    void testBefore(){
        System.out.println("HELLO BEFORE ADVICE");
    }

    /*@After("execution(* com.example.aop.test..*.*(..))")
    void testAfter(){
        System.out.println("HELLO AFTER ADVICE");
    }*/

    @Around("execution(String com.example.aop.test..*.*(..))")
    Object testAround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("AROUND's BEFORE");
        Object object = null;
        try{
            object = proceedingJoinPoint.proceed();
        }catch (Throwable throwable){
            return "Error handling thing!";
        }
        System.out.println("AROUND's AFTER");
        if(object != null && object.equals("Hello")) {
            return "Changed the value!";
        }
        return object;
    }
}
