package com.cxlong.service.inter;

import com.cxlong.domain.Student;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/3 10:19
 * @description: 学生服务接口
 */
public interface StudentService {
    /*
        根据字典键值查询学生作为字典
     */
    List<Student> queryStudentAsDict(int classesId);

    /*
        根据id查询学生
     */
    Student queryStudentById(int id);
}
