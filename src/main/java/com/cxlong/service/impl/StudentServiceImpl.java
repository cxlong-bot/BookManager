package com.cxlong.service.impl;

import com.cxlong.dao.StudentDao;
import com.cxlong.domain.Student;
import com.cxlong.service.inter.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/3 10:20
 * @description: 学生服务对象
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /*
        根据键值(班级id)查询学生作为字典
     */
    @Override
    public List<Student> queryStudentAsDict(int classesId) {
        return studentDao.selectStudentAsDict(classesId);
    }

    /*
        根据id查询学生
     */
    @Override
    public Student queryStudentById(int id) {
        return studentDao.selectStudentById(id);
    }
}
