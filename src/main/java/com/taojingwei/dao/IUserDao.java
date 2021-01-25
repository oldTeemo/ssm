package com.taojingwei.dao;

import com.taojingwei.pojo.User;

public interface IUserDao {
    void addUser(User user);

    void deleteUser();

    User getUser(String id);
}