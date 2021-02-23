package org.xumiao.Prototype;

import java.io.Serializable;

public class User implements Cloneable, Serializable {

    private String name;
    private int age;
    private Address address;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();//浅拷贝
        if (address != null) {
            user.address = (Address) address.clone(); //深拷贝
        }
        return user;
    }

    /**
     * 解决多层引用类型克隆问题深拷贝，序列化
     * @return
     */
//    public User deepCopy() {
//
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
