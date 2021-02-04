package com.taojingwei.aop;

import com.taojingwei.controller.AddController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTest {

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @Pointcut("execution (* com.taojingwei.controller..*.*(..))")
    public  void controllerAspect() {}

    @Pointcut("execution (* com.taojingwei.service..*.*(..))")
    public  void controllerAspectss() {}

    @Before("controllerAspect()")
    public void before(JoinPoint p){
        logger.info("ssssshhhhhhhhhhhhbefore");
    }

    @Before("controllerAspectss()")
    public void befores(JoinPoint p){
        logger.info("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    }

}
