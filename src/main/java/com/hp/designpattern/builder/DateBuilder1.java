package com.hp.designpattern.builder;

// 具体生成器
public class DateBuilder1 implements IDateBuilder {
    private final MyDate myDate;

    public DateBuilder1(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public IDateBuilder buildDate(int year, int month, int day) {
        myDate.date = year + "-" + month + "-" + day;
        return this;
    }

    @Override
    public String date() {
        return myDate.date;
    }
}
