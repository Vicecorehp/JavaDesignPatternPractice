package com.hp.designpattern.abstractfactory.iterator;

//抽象产品
public interface IIterator<T> {
    boolean hasNext();

    Object next();
}