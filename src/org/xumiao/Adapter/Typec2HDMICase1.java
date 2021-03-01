package org.xumiao.Adapter;

/**
 * 方式一：类的适配器模式
 */
public class Typec2HDMICase1 extends Phone implements HDMI {
    @Override
    public void hdmiInterface() {
        typecPhone();
        System.out.println("接收到type-c口信息，信息转换HDMI接口中...");
        System.out.println("信息已转换成HDMI接口，显示屏可以对接。");
    }
}
