package com.hp.designpattern.chainofresponsibility;

//处理者
public interface Handler {
    int handleRequest(int n);

    void setNextHandler(Handler next);
}
