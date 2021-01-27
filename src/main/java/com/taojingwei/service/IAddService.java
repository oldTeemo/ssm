package com.taojingwei.service;

import com.taojingwei.pojo.User;

/**
 * @author liuwei
 */
public interface IAddService {

    void addUser(User user);

    void deleteUser(String id);

    void updateUser(User user);

    User getUser(String id);
}