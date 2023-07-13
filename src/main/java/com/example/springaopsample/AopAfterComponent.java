package com.example.springaopsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAfterComponent {

    @AfterReturning(value = "execution(* *..*.*AopController.*(..))")
    public void afterReturningComponent(JoinPoint joinPoint) {
        System.out.println("afterReturningComponent" + joinPoint.getSignature());
    }


    @AfterThrowing(value = "execution(* *..*.*AopController.*(..))", throwing = "throwable")
    public void afterThrowingComponent(JoinPoint joinPoint, Throwable throwable) throws RuntimeException {
        System.out.println("afterThrowingComponent: " + joinPoint.getSignature());
        System.out.println("afterThrowingComponent: " + throwable);
    }

}
