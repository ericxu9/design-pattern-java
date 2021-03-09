package org.xumiao.TemplateMethod;

public class ConcreteTemplate extends AbstractTemplate{

    @Override
    protected void apply() {
        System.out.println("子类实现了抽象方法apply哦~~");
    }

    @Override
    protected void end() {
        super.end();
        System.out.println("实现类调用end方法结束~");
    }
}
