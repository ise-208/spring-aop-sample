package com.example.springaopsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(value = "execution(* *..*.*AopController.*(..))", returning = "sample")
    public void afterReturningComponent(JoinPoint joinPoint) {
        System.out.println("afterReturningComponente" + joinPoint.getSignature());

    }

//    @Around("target(com.example.springaopsample.AopController)")
//    public void targetComponent() {
//        System.out.println("targetComponent");
//    }

    public void doService() {
        System.out.println("hello");
    }

}
