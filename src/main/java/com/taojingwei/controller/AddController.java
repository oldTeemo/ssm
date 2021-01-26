package com.taojingwei.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwei
 */
@RestController
@RequestMapping("/user")
public class AddController {

    public static Map<String, HttpSession> x = new HashMap<>();
    public static HttpSession session;

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @Resource
    private IAddService addService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request, Model model) {
        logger.error("1111111111111111111");
        logger.info("222222222222222");
        logger.info("33333333333");
        System.out.println("4444");
        addService.deleteUser();
        Class.forName();
        return "1";
    }

}