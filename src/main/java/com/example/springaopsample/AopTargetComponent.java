package com.example.springaopsample;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTargetComponent {

    @Around("target(com.example.springaopsample.AopController)")
    public void targetComponent() {
        System.out.println("targetComponent");
    }

    @Around("within(com.example.springaopsample.AopController)")
    public void withinComponent() {
        System.out.println("withinComponent");
    }

    @Around("target(com.example.springaopsample.AopController) && args(java.lang.String)")
    public void withinArgComponent() {
        System.out.println("targetArgComponent");
    }

}
