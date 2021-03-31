package org.xumiao.State;

public class RevertState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);
        //todo 执行加库存操作
    }
}
