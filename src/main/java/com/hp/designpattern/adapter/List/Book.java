package com.hp.designpattern.adapter.List;

import java.util.Enumeration;
import java.util.Vector;

//被适配者
public class Book {
    private final Vector<String> books;

    public Book() {
        books = new Vector<>();
    }

    public void add(String book) {
        books.add(book);
    }

    public Enumeration<String> getEnum() {
        return books.elements();
    }
}