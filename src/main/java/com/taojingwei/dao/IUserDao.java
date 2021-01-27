package com.taojingwei.dao;

import com.taojingwei.pojo.User;

/**
 * @author liuwei
 */
public interface IUserDao {
    void addUser(User user);

    void deleteUser(String id);

    User getUser(String id);

    void updateUser(User user);
}