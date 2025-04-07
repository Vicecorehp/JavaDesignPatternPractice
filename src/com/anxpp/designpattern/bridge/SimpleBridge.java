package com.anxpp.designpattern.bridge;

//桥接模式
public class SimpleBridge {
    public static void main(String[] args) {
        new LenovoComputer(new Amd()).describe();
        new HaseeComputer(new Intel()).describe();
    }
}

// 实现者
interface Cpu {
    String describe();
}

// 具体实现者*2
class Amd implements Cpu {
    public String describe() {
        return "AMD YES!";
    }
}

class Intel implements Cpu {
    public String describe() {
        return "INTEL LUNAR LAKE!";
    }
}

// 抽象
abstract class AbstractComputer {
    Cpu cpu;

    public AbstractComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public abstract void describe();

}

// 细化抽象*2
class LenovoComputer extends AbstractComputer {
    public LenovoComputer(Cpu cpu) {
        super(cpu);
    }

    @Override
    public void describe() {
        System.out.println("联想笔记本cpu:" + super.cpu.describe());
    }
}

class HaseeComputer extends AbstractComputer {
    public HaseeComputer(Cpu cpu) {
        super(cpu);
    }

    @Override
    public void describe() {
        System.out.println("神舟笔记本cpu:" + super.cpu.describe());
    }
}