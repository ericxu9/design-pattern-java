package org.xumiao.Composite;

import java.util.ArrayList;
import java.util.List;


public class Employee {

    /**
     * 姓名
     */
    private String name;
    /**
     * 部门
     */
    private String dept;
    /**
     * 薪水
     */
    private int salary;
    /**
     * 下属
     */
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        this.subordinates.add(employee);
    }

    public void remove(Employee employee) {
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
