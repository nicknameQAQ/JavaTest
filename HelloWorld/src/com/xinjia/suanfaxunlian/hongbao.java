package com.xinjia.suanfaxunlian;

import java.util.Random;

public class hongbao {
    public static void main(String[] args){
        //M表示红包总额,N表示红包个数,有N个人
        int M = 2;//单位分
        int N = 5;

        // 边界检查：确保总金额足够
        if (M < N) {
            System.out.println("总金额不足，无法分配");
            return;
        }

        Random r = new Random();
        for (int i = 1; i < N; i++) {
            int mymoney = r.nextInt(M-(N - i))+1;
            M -= mymoney;
            System.out.println("第" + i + "个人,抢到" + mymoney + "分" );
        }
        System.out.println("第" + N + "个人,抢到" + M + "分");
    }
}