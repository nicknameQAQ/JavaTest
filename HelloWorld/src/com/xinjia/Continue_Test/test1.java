package com.xinjia.Continue_Test;

public class test1 {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
