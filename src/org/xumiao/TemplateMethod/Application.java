package org.xumiao.TemplateMethod;

/**
 * 模板方法模式
 */
public class Application {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();

        System.out.println(Integer.MAX_VALUE);
    }
}
