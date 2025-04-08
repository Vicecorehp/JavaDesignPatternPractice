package com.hp.designpattern.chainofresponsibility;

// 第二个具体处理者，处理n>=0且<10的情况
public class SquareHandler implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        if (n < 10) {
            return n * n;
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
