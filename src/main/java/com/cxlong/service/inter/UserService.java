package com.cxlong.service.inter;

import com.cxlong.domain.User;

/**
 * @author: long
 * @date: 2021/4/30 9:38
 * @description: 用户服务接口
 */
public interface UserService {
    /*
        根据用户信息查询用户
     */
    User findUser(User user);

    /*
        添加用户
     */
    int addUser(User user) throws Exception;
}
