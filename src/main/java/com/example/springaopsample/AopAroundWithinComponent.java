package com.example.springaopsample;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAroundWithinComponent {

    @Around("within(com.example.springaopsample.AopController)")
    public void withinComponent() {
        System.out.println("AopAroundWithinComponent");
        withinSample();
    }

    private void withinSample() {
        System.out.println("withinSample");
    }

}

