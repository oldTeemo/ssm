package com.taojingwei.controller;

import javax.annotation.Resource;

import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwei
 */
@RestController
@RequestMapping("/user")
public class AddController{

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @Resource
    private IAddService addService;

    @Cacheable("2i3")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestBody User user){
        logger.info(user.toString());
        addService.deleteUser(user.getId());
        return "1";
    }

}