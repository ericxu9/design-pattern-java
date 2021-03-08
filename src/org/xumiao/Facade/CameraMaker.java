package org.xumiao.Facade;

/**
 * 定义一个门面
 */
public class CameraMaker {

    private Camera eosrp;
    private Camera xt4;

    public CameraMaker() {
        this.eosrp = new CanonEOSRP();
        this.xt4 = new FujiXT4();
    }

    /**
     * 下面定义一堆方法，具体应该调用什么方法，有这个门面决定
     */

    public void takePicture2EOSRP() {
        eosrp.shutter();
    }

    public void takePicture2XT4() {
        xt4.shutter();
    }
}
