package com.xinjia.Continue_Test;

public class test2 {
    //逢7过
    static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 0){
                System.out.println("过");
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
