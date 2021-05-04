package com.cxlong.dao;

import com.cxlong.domain.Classes;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 16:59
 * @description: 班级持久层
 */
public interface ClassesDao {
    /*
        查询所有班级作为字典sql
     */
    List<Classes> selectClassesAsDict();

    /*
        查询所有班级sql
    */
    List<Classes> selectClasses();

    /*
        根据id查询班级sql
    */
    Classes selectClassesById(int id);

    /*
        插入班级sql
     */
    int insertClasses(Classes classes);

    /*
        更新班级sql
     */
    int updateClasses(Classes classes);

    /*
        删除班级sql
     */
    int deleteClasses(String[] ids);
}
