package com.example.springaopsample;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAroundTargetArgsComponent {

    @Around("target(com.example.springaopsample.AopController) && args(java.lang.String)")
    public void withinArgComponent() {
        System.out.println("targetArgComponent");
    }

}
