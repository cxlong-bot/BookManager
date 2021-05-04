package com.cxlong.domain;

import java.util.Date;

/**
 * @author: long
 * @date: 2021/4/29 16:50
 * @description: 班级类
 */
public class Classes extends DictionaryTag {
    private Integer id;
    private String classesName;
    private String classesGraduateYear;
    private String classesMajor;
    private String classesDesc;

    public Classes() {
    }

    public Classes(Integer id, String classesName, String classesGraduateYear, String classesMajor, String classesDesc) {
        this.id = id;
        this.classesName = classesName;
        this.classesGraduateYear = classesGraduateYear;
        this.classesMajor = classesMajor;
        this.classesDesc = classesDesc;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getClassesGraduateYear() {
        return classesGraduateYear;
    }

    public void setClassesGraduateYear(String classesGraduateYear) {
        this.classesGraduateYear = classesGraduateYear;
    }

    public String getClassesMajor() {
        return classesMajor;
    }

    public void setClassesMajor(String classesMajor) {
        this.classesMajor = classesMajor;
    }

    public String getClassesDesc() {
        return classesDesc;
    }

    public void setClassesDesc(String classesDesc) {
        this.classesDesc = classesDesc;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", classesName='" + classesName + '\'' +
                ", classesGraduateYear='" + classesGraduateYear + '\'' +
                ", classesMajor='" + classesMajor + '\'' +
                ", classesDesc='" + classesDesc + '\'' +
                '}';
    }
}
