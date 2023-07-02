package com.example.springaopsample;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopComponent {
    @Before("execute")
    public void beforeComponent() {

    }

    @After("execute")
    public void afterComponent(){

    }

}
