package com.example.springaopsample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    AopComponent aopComponent;
    Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");

    public AopController(AopComponent aopComponent) {
        this.aopComponent = aopComponent;
    }

    @GetMapping("/hello")
    public void hello() {
        aopComponent.doService();
    }

    @GetMapping("/json")
    public void json() {
        logger.info("info message");
    }

}
