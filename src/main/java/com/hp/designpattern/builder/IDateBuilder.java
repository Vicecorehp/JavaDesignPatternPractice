package com.hp.designpattern.builder;

//抽象生成器
public interface IDateBuilder {
    IDateBuilder buildDate(int year, int month, int day);

    String date();
}
