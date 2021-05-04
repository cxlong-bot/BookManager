package com.cxlong.domain;


/**
 * @author: long
 * @date: 2021/4/29 16:39
 * @description: 图书类
 */
public class Book extends DictionaryTag{

    private Integer id;
    private String bookName;
    private String author;
    private double price;

    public Book() {
    }

    public Book(Integer id, String bookName, String author, double price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
