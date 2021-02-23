package org.xumiao.Prototype;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("深圳市");
        User user1 = new User("xumiao", 24);
        user1.setAddress(addr);
        User user2 = (User) user1.clone();

        System.out.println("user1:" + user1.toString());
        System.out.println("user2:" + user2.toString());

        user2.setName("xumiao clone");
        /*
        user1:User{name='xumiao', age=24, address=Address{addr='深圳市'}}
        user2:User{name='xumiao', age=24, address=Address{addr='深圳市'}}
        user1:User{name='xumiao', age=24, address=Address{addr='南京'}}
        user2:User{name='xumiao clone', age=24, address=Address{addr='南京'}}
         */
        addr.setAddr("南京"); //内嵌引用类型并不是深拷贝，需要实现Cloneable接口进行处理

        System.out.println("user1:" + user1.toString());
        System.out.println("user2:" + user2.toString());

        System.out.println(user1 == user2);
    }
}
