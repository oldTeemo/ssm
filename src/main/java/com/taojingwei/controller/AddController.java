package com.taojingwei.controller;

import javax.annotation.Resource;

import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwei
 */
@RestController
@Cacheable("ttss")
@RequestMapping("/user")
public class AddController implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @Resource
    private IAddService addService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestBody User user) throws InterruptedException {
        logger.info(user.toString());
        addService.deleteUser(user.getId());
        return "1";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}