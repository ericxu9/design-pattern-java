package org.xumiao.Adapter;

/**
 * 第三种方式：接口的适配器模式
 */
public class Typec2HDMICase3 {

    public interface Target {
        void typec();

        void typec2hdmi();
    }

    public abstract class Adapter implements Target {
        public void typec() {}

        public void typec2hdmi() {}
    }

    public class HDMIAdapter extends Adapter {
        @Override
        public void typec() {
            System.out.println("信息从Typec口输出。");
        }

        @Override
        public void typec2hdmi() {
            System.out.println("接收到type-c口信息，信息转换HDMI接口中...");
            System.out.println("信息已转换成HDMI接口，显示屏可以对接。");
        }
    }
}
