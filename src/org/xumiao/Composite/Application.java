package org.xumiao.Composite;

/**
 * 组合模式
 */
public class Application {

    public static void main(String[] args) {
        Employee root = new Employee("经理","研发部",100000);
        root.add(new Employee("员工1","研发部",3000));
        System.out.println(root);
    }
}
