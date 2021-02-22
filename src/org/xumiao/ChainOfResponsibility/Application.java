package org.xumiao.ChainOfResponsibility;

public class Application {

    public static void main(String[] args) {
        Context context = new Context();

        RuleHandler newUserHandler = new NewUserRuleHandler();
        RuleHandler locationHandler = new LocationRuleHandler();
        RuleHandler limitHandler = new LimitRuleHandler();

        newUserHandler.setSuccessor(locationHandler);
        locationHandler.setSuccessor(limitHandler);

        newUserHandler.apply(context);
    }
}
