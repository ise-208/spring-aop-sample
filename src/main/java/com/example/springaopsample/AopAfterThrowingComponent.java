package com.example.springaopsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAfterThrowingComponent {

    @AfterReturning(value = "execution(* *..*.*AopController.*(..))")
    public void afterThrowingComponent(JoinPoint joinPoint) {
        System.out.println("afterThrowingComponent" + joinPoint.getSignature());
    }

}
