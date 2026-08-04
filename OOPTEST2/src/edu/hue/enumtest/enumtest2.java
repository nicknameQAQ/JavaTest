package edu.hue.enumtest;

public class enumtest2 {
    public static void main(String[] args) {
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());
        OrderState[] arr = OrderState.values();
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i].getName());
        }
        System.out.println("-----------------");
        OrderState o2 = OrderState.valueOf("PAYMENT_PENDING");
        System.out.println(o2);

    }
}
