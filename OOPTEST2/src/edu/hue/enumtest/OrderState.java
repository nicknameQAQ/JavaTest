package edu.hue.enumtest;

public enum OrderState {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERING("配送中"),
    COMPLETED("已完成"),
    CANCELLED("已取消");
    private String name;
    //提供构造方法
    private OrderState(String name){
        System.out.println("看看我执行了吗" + name);
        this.name = name;
    }
    //get,set方法

    public String getName() {
        return name;
    }
}
