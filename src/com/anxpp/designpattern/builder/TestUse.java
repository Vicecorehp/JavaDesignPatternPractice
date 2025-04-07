package com.anxpp.designpattern.builder;

public class TestUse {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        IDateBuilder builder;
        builder = new DateBuilder1(date);
        System.out.println("builder.buildDate(2066, 3, 5).date() = " +
                builder.buildDate(2066, 3, 5).date());
        System.out.println("builder.buildDate(2008, 5, 12).buildDate(2008, 8, 8).date() = " +
                builder.buildDate(2008, 5, 12)
                        .buildDate(2008, 8, 8).date());
        builder = new DateBuilder2(date).buildDate(2066, 3, 5);
        System.out.println(builder.date());
    }
}