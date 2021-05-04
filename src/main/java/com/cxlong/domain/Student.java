package com.cxlong.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: long
 * @date: 2021/4/29 17:03
 * @description: 学生类
 */
public class Student extends DictionaryTag{
    private Integer id;
    private String studentName;
    private String studentNo;
    private String idCard;
    private String studentEmail;
    private Integer classesId;

    public Student() {
    }

    public Student(Integer id, String studentName, String studentNo, String idCard, String studentEmail, Integer classesId) {
        this.id = id;
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.idCard = idCard;
        this.studentEmail = studentEmail;
        this.classesId = classesId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", idCard='" + idCard + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", classesId=" + classesId +
                '}';
    }
}
