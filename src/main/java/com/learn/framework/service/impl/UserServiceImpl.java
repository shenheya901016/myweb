package com.learn.framework.service.impl;

import com.learn.framework.bean.User;
import com.learn.framework.dao.IUserDao;
import com.learn.framework.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
     @Resource
     private IUserDao userDao;

        public void saveUser(User u) {

           this.userDao.saveUser(u);
        }
}
