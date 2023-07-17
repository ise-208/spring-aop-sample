package com.example.springaopsample;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAroundTargetComponent {

    @Around("target(com.example.springaopsample.AopController)")
    public void targetComponent() {
        System.out.println("AopAroundTargetComponent");
    }

}
