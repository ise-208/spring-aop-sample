package com.example.springaopsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    AopComponent aopComponent;

    public AopController(AopComponent aopComponent) {
        this.aopComponent = aopComponent;
    }

    @GetMapping("/hello")
    public void hello() {
        aopComponent.doService();
    }

}
