package com.hp.designpattern.chainofresponsibility;

// 第一个具体处理者，处理小于0的情况
public class AbsoluteHandler implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        if (n < 0) {
            return -n;
        }
        if (next == null) {
            throw new NullPointerException("next 不能为空");
        }
        return next.handleRequest(n);
    }

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }
}
