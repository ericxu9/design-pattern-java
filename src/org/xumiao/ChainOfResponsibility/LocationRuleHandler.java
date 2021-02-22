package org.xumiao.ChainOfResponsibility;

public class LocationRuleHandler extends RuleHandler{
    @Override
    public void apply(Context context) {
        if (context.isSupportedLocation()) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        }else {
            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动!");
        }
    }
}
