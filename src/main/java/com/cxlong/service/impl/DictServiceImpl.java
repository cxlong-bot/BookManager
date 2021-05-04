package com.cxlong.service.impl;

import com.cxlong.dao.DictDao;
import com.cxlong.domain.DictionaryTag;
import com.cxlong.service.inter.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 16:13
 * @description: 字典服务对象
 */
@Service
public class DictServiceImpl implements DictService {
    @Resource
    private DictDao dictDao;

    /*
        根据键值查询字典
     */
    @Override
    public List<DictionaryTag> queryDict(String key) {
        return dictDao.selectDict(key);
    }
}
