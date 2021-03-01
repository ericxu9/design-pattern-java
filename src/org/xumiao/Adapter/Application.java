package org.xumiao.Adapter;

public class Application {

    public static void main(String[] args) {
        System.out.println("--第一种适配器方式--");
        HDMI case1 = new Typec2HDMICase1();
        case1.hdmiInterface();
        System.out.println("接口转换成功啦~");

        System.out.println("--第二种适配器方式--");
        HDMI case2 = new Typec2HDMICase2(new Phone());
        case1.hdmiInterface();
        System.out.println("接口转换成功啦~");

        System.out.println("--第三种适配器方式--");
        Typec2HDMICase3.Adapter adapter = new Typec2HDMICase3().new HDMIAdapter();
        adapter.typec();
        adapter.typec2hdmi();
        System.out.println("接口转换成功啦~");
    }
}
