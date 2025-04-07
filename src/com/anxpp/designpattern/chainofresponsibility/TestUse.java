package com.anxpp.designpattern.chainofresponsibility;

public class TestUse {
    public static void main(String[] args) {
        // 初始化处理类
        Handler absoluteHandler = new AbsoluteHandler();
        Handler squareHandler = new SquareHandler();
        Handler nativeHandler = new NativeHandler();

        // 设置处理类的先后关系，即完成职责链的初始化
        absoluteHandler.setNextHandler(squareHandler);
        squareHandler.setNextHandler(nativeHandler);

        // 对于 n = -1，返回其绝对值（n < 0）
        System.out.println(absoluteHandler.handleRequest(-1));
        // 对于 n = 5，返回其平方（n >= 0 && n <= 10）
        System.out.println(absoluteHandler.handleRequest(5));
        // 对于 n = 9999，返回其原值（n > 0 && n < Integer.MAX_VALUE）
        System.out.println(absoluteHandler.handleRequest(9999));
    }
}