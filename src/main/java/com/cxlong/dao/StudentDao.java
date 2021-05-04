package com.cxlong.dao;

import com.cxlong.domain.Student;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/3 10:07
 * @description: 学生持久层
 */
public interface StudentDao {
    /*
        根据班级id查询所有学生作为字典sql
     */
    List<Student> selectStudentAsDict(int classesId);

    /*
        根据id查询学生sql
     */
    Student selectStudentById(int id);
}
