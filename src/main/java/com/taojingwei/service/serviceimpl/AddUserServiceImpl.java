package com.taojingwei.service.serviceimpl;

import com.taojingwei.controller.AddController;
import com.taojingwei.dao.IUserDao;
import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author liuwei
 */
@Service
public class AddUserServiceImpl implements IAddService {

    @Resource
    private IUserDao userDao;

    private static final Logger logger = LoggerFactory.getLogger(AddUserServiceImpl.class);
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(String id)  {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUser(String id) {
       return userDao.getUser(id);
    }

}
