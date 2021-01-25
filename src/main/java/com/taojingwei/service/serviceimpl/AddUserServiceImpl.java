package com.taojingwei.service.serviceimpl;

import com.taojingwei.dao.IUserDao;
import com.taojingwei.pojo.User;
import com.taojingwei.service.IAddService;

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

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }

}
