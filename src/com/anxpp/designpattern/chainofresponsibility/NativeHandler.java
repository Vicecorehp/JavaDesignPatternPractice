package com.anxpp.designpattern.chainofresponsibility;

// 第三个具体处理者，处理n>10的情况
public class NativeHandler implements Handler {
    private Handler next;

    @Override
    public int handleRequest(int n) {
        if (n < Integer.MAX_VALUE) {
            return n;
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
