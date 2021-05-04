package com.cxlong.domain;

import java.util.Date;

/**
 * @author: long
 * @date: 2021/4/29 16:59
 * @description: 字典类
 */
public class DictionaryTag {
    private Integer id;
    private String dictionaryTagKey;
    private String dictionaryTagValue;
    private String dictionaryTagDesc;
    private String dictionaryId;
    private String createTime;

    public DictionaryTag() {
    }

    public DictionaryTag(Integer id, String dictionaryTagKey, String dictionaryTagValue, String dictionaryTagDesc, String dictionaryId, String createTime) {
        this.id = id;
        this.dictionaryTagKey = dictionaryTagKey;
        this.dictionaryTagValue = dictionaryTagValue;
        this.dictionaryTagDesc = dictionaryTagDesc;
        this.dictionaryId = dictionaryId;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictionaryTagKey() {
        return dictionaryTagKey;
    }

    public void setDictionaryTagKey(String dictionaryTagKey) {
        this.dictionaryTagKey = dictionaryTagKey;
    }

    public String getDictionaryTagValue() {
        return dictionaryTagValue;
    }

    public void setDictionaryTagValue(String dictionaryTagValue) {
        this.dictionaryTagValue = dictionaryTagValue;
    }

    public String getDictionaryTagDesc() {
        return dictionaryTagDesc;
    }

    public void setDictionaryTagDesc(String dictionaryTagDesc) {
        this.dictionaryTagDesc = dictionaryTagDesc;
    }

    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DictionaryTag{" +
                "id=" + id +
                ", dictionaryTagKey='" + dictionaryTagKey + '\'' +
                ", dictionaryTagValue='" + dictionaryTagValue + '\'' +
                ", dictionaryTagDesc='" + dictionaryTagDesc + '\'' +
                ", dictionaryId='" + dictionaryId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
