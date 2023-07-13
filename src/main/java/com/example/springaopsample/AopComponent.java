package com.example.springaopsample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopComponent {
    @Before("execution(* *..*.*AopController.*(..))")
    public void beforeComponent() {
        System.out.println("beforeComponent");
    }

    @After("execution(* *..*.*AopController.*(..))")
    public void afterComponent() {
        System.out.println("afterComponent");
    }


    public void doService() {
        System.out.println("hello");
    }

    public void doExService() {
        throw new RuntimeException();
    }
}
