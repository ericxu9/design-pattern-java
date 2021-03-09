package org.xumiao.TemplateMethod;

public abstract class AbstractTemplate {

    public void templateMethod() {
        init();
        apply();
        end();
    }

    protected void init() {
        System.out.println("Template::init().");
    }

    protected abstract void apply();

    protected void end() {
        System.out.println("Template::end().");
    }
}
