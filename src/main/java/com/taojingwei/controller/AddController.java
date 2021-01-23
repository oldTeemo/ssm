package com.taojingwei.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

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

    @Resource
    private IAddService addService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request, Model model) {
        x.put(request.getSession().getId(), request.getSession());
        User user = new User();
        user.setName("");
        session = request.getSession();
        session.setAttribute("name", "value");
        addService.addUser(user);
        System.out.println("2223");
        return "1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2(HttpServletRequest request, Model model) {
        return session.getAttribute("name").toString();
    }
}