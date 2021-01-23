package com.taojingwei.service.serviceimpl;

import com.taojingwei.dao.IUserDao;
import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AddUserServiceImpl implements IAddService {

    @Resource
    private IUserDao userDao;

    @Transactional()
    public void addUser(User user) {
        System.out.println("ss");
        user.setName("11");
        userDao.addUser(user);
    }

}
