package com.cxlong.service.impl;

import com.cxlong.dao.UserDao;
import com.cxlong.domain.User;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: long
 * @date: 2021/4/30 9:44
 * @description: 用户服务对象
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /*
        登录验证服务
     */
    @Override
    public User findUser(User user) {
        return userDao.selectUser(user);
    }

    /*
        用户注册服务，配置事物，发生异常回滚
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int addUser(User user) throws Exception{
        int num = userDao.insertUser(user);
        if(num != 1)
            throw new BusinessException("00053","注册用户失败");
        return num;
    }
}
