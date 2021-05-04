package com.cxlong.domain;


import java.util.Date;

/**
 * @author: long
 * @date: 2021/4/29 16:46
 * @description: 借阅记录类
 */
public class BorrowRecord {
    private Integer id;
    private Integer bookId;
    private Integer studentId;
    private String startTime;
    private String endTime;
    private String createTime;
    private Book book;
    private Student student;
    private Classes classes;

    public BorrowRecord() {
    }

    public BorrowRecord(Integer id, Integer bookId, Integer studentId, String startTime, String endTime, String createTime, Book book, Student student, Classes classes) {
        this.id = id;
        this.bookId = bookId;
        this.studentId = studentId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.book = book;
        this.student = student;
        this.classes = classes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", createTime='" + createTime + '\'' +
                ", book=" + book +
                ", student=" + student +
                ", classes=" + classes +
                '}';
    }
}
