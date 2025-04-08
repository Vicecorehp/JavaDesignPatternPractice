package com.hp.designpattern.builder;

//指挥者
public class Director {
    private final IDateBuilder builder;

    public Director(IDateBuilder builder) {
        this.builder = builder;
    }

    public String getDate(int year, int month, int day) {
        builder.buildDate(year, month, day);
        return builder.date();
    }
}
