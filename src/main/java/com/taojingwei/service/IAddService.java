package com.taojingwei.service;

import com.taojingwei.pojo.User;

/**
 * @author liuwei
 */
public interface IAddService {
    /**
     * fetch data by rule id
     * @param user rule id
     * @return Result<XxxxDO>
     */
    void addUser(User user);

    /**
     * fetch data by rule id
     * @return Result<XxxxDO>
     */
    void deleteUser();
}