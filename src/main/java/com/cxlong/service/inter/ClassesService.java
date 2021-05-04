package com.cxlong.service.inter;

import com.cxlong.domain.Classes;
import com.cxlong.domain.Page;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:06
 * @description: 班级服务接口
 */
public interface ClassesService {
    /*
        查询班级信息作为字典
     */
    List<Classes> queryClassesAsDict();

    /*
        分页查询班级
     */
    List<Classes> queryClasses(Page page);

    /*
        根据id查询班级
     */
    Classes queryClassesById(int id);

    /*
        添加班级
     */
    int addClasses(Classes classes) throws Exception;

    /*
        修改班级
     */
    int updateClasses(Classes classes) throws Exception;

    /*
        批量删除班级
     */
    int deleteClasses(String[] ids) throws Exception;
}
