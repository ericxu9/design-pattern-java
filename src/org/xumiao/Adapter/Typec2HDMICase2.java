package org.xumiao.Adapter;

/**
 * 第二种方式：对象的适配器模式
 */
public class Typec2HDMICase2 implements HDMI{

    private Phone phone;

    public Typec2HDMICase2(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void hdmiInterface() {
        if (phone != null) {
            phone.typecPhone();
            System.out.println("接收到type-c口信息，信息转换HDMI接口中...");
            System.out.println("信息已转换成HDMI接口，显示屏可以对接。");
        }
    }
}
