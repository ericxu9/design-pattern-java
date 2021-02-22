package org.xumiao.ChainOfResponsibility;

public class LimitRuleHandler extends RuleHandler{
    @Override
    public void apply(Context context) {
        if (context.remainedTimes() > 0) {
            throw new RuntimeException("您来得太晚了，奖品被领完了！");
        }else {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        }
    }
}
