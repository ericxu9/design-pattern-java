package org.xumiao.ChainOfResponsibility;

/**
 * 有这么一个场景，用户参加一个活动可以领取奖品，但是活动需要进行很多的规则校验然后才能放行，比如首先需要校验用户是否是新用户、今日参与人数是否有限额、全场参与人数是否有限额等等。设定的规则都通过后，才能让用户领走奖品。
 */
public abstract class RuleHandler {

    protected RuleHandler successor;

    public abstract void apply(Context context);

    public RuleHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }
}
