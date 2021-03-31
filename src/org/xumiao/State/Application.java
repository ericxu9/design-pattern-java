package org.xumiao.State;

public class Application {

    public static void main(String[] args) {
        Context context = new Context("iPhoneX");

        State deductState = new DeductState();
        deductState.doAction(context);

        State revertState = new RevertState();
        revertState.doAction(context);
    }
}
