package org.xumiao.Builder;

public class Application {

    public static void main(String[] args) {
        User user = User.builder().name("许渺").password("123456").age(24).build();
        System.out.println(user);
    }
}
