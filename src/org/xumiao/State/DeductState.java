package org.xumiao.State;

public class DeductState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);
    }
}
