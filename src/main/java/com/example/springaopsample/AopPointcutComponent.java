package com.example.springaopsample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopPointcutComponent {

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void pointcutAnnotationComponent() {
        System.out.println("pointcutAnnotationComponent");
    }
}
