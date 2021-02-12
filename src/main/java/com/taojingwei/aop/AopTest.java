package com.taojingwei.aop;

import com.taojingwei.controller.AddController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @author liuwei
 */
@Component
@Aspect
public class AopTest {

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @Pointcut("execution (* com.taojingwei.controller..*.*(..))")
    public void controllerAspect() {
    }

    @Pointcut("execution (* com.taojingwei.service..*.*(..))")
    public void serviceAspect() {
    }

    @Before("controllerAspect()")
    public void beforeC() throws UnsupportedEncodingException {
        logger.info("是谁的s");
    }

    @Before("serviceAspect()")
    public void beforeS() {
        logger.info("service都打这个");
    }

}
