package com.anujaneja.springTest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by anuj on 11/10/17.
 */
@Aspect
public class LoggingAspect {

    @Before("allGetters()")
    public void loggingAspect() {
        System.out.println("Logging Advice called");

    }


    @Before("allGetters()")
    public void anotherAspect() {
        System.out.println("Another Advice called");
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {

    }
 }
