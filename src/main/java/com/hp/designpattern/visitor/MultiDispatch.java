package com.hp.designpattern.visitor;

public class MultiDispatch {
    public static void main(String[] args) {
        Father child = new Child();
        child.print();
        new Child().print(new VisitorInner());
    }
}

class Father {
    void print() {
        System.out.println("父类");
    }
}

class Child extends Father {
    void print() {
        System.out.println("子类");
    }

    void print(VisitorInner c) {
        c.print(this);
    }
}

class VisitorInner {
    public void print(Child child) {
        child.print();
    }
}