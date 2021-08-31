package cn.guosgbin.pattern.state.order;

public class OrderStatusContext implements OrderOperate{

    private OrderOperate orderOperate;

    @Override
    public void pay(Order order) {

    }

    @Override
    public void cancel(Order order) {

    }

    @Override
    public void appeal(Order order) {

    }

    @Override
    public void release(Order order) {

    }
}
