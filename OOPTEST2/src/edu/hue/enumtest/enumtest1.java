package edu.hue.enumtest;

public class enumtest1 {
    /*
    待支付    PAYMENT_PENDING
    处理中    PROCESSING
    已发货    SHIPPED
    配送中    DELIVERING
    已完成    COMPLETED
    已取消    CANCELLED
    */
    public static void main(String[] args) {
        //调用可以直接通过类名,因为枚举项自带public static final修饰
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());
        switch (o1){
            case PAYMENT_PENDING -> System.out.println("待支付状态");
            case PROCESSING -> System.out.println("处理中状态");
            case SHIPPED -> System.out.println("已发货状态");
            case DELIVERING -> System.out.println("配送中状态");
            case COMPLETED -> System.out.println("已完成状态");
            case CANCELLED -> System.out.println("已取消状态");
        }
    }
}
