package com.cxlong.dao;

import com.cxlong.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author: long
 * @date: 2021/4/29 21:45
 * @description: 用户持久层
 */
public interface UserDao {
    /*
        根据用户信息查询用户sql
     */
    User selectUser(User user);

    /*
        插入用户sql
     */
    int insertUser(User user);
}
