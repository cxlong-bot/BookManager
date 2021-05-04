package com.cxlong.service.impl;

import com.cxlong.dao.ClassesDao;
import com.cxlong.domain.Classes;
import com.cxlong.domain.Page;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.ClassesService;
import com.cxlong.util.CountHolder;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:07
 * @description: 班级服务对象
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Resource
    private ClassesDao classesDao;

    /*
        查询班级作为字典
     */
    @Override
    public List<Classes> queryClassesAsDict() {
        return classesDao.selectClassesAsDict();
    }

    /*
        记录所有记录条数，根据分页信息分页查询
     */
    @Override
    public List<Classes> queryClasses(Page page) {
        CountHolder.set(classesDao.selectClasses().size());
        PageHelper.startPage(page.getPageNumber(), page.getPageSize());
        List<Classes> classesList = classesDao.selectClasses();
        return classesList;
    }

    /*
        根据id查询班级
     */
    @Override
    public Classes queryClassesById(int id) {
        return classesDao.selectClassesById(id);
    }

    /*
        添加班级，配置事物，发生异常回滚
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int addClasses(Classes classes) throws Exception{
        int num = classesDao.insertClasses(classes);
        if(num != 1)
            throw new BusinessException("00013","插入班级信息异常");
        return num;
    }

    /*
        修改班级，配置事物，发生异常回滚
    */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int updateClasses(Classes classes) throws Exception{
        int num = classesDao.updateClasses(classes);
        if(num != 1)
            throw new BusinessException("00014","修改班级信息异常");
        return num;
    }

    /*
        删除班级，配置事物，发生异常回滚
    */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int deleteClasses(String[] ids) throws Exception{
        int num = classesDao.deleteClasses(ids);
        if(num != ids.length)
            throw new BusinessException("00015","删除班级信息异常");
        return num;
    }
}
