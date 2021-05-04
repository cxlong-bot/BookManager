package com.cxlong.service.inter;

import com.cxlong.domain.DictionaryTag;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 16:11
 * @description: 字典服务接口
 */
public interface DictService {
    /*
        根据键值查询字典
     */
    List<DictionaryTag> queryDict(String key);
}
