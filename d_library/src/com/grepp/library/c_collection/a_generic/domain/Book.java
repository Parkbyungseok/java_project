package com.grepp.library.c_collection.a_generic.domain;

public class Book {

    // !!!!!생성자랑 Setter 가 같이 있으면 객체 생성 후 값을 수정할 수 있음
    private String title;
    private String author;

    //생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
