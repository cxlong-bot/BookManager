package com.cxlong.dao;

import com.cxlong.domain.DictionaryTag;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 15:59
 * @description: 字典持久层
 */
public interface DictDao {
    /*
        根据键值查询字典sql
     */
    List<DictionaryTag> selectDict(String key);
}
