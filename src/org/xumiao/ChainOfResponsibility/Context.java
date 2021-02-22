package org.xumiao.ChainOfResponsibility;

public class Context {

    /**
     * 是否是新用户
     * @return
     */
    public boolean isNewUser() {
        return true;
    }

    /**
     * 是否是所在地区
     * @return
     */
    public boolean isSupportedLocation() {
        return true;
    }

    /**
     * 奖品领取次数
     * @return
     */
    public int remainedTimes() {
        return 1;
    }
}
