package edu.hue.oopextendsneicuntest2;

import org.openjdk.jol.vm.VM;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建子类对象
        Zi z = new Zi();
        // 利用第三方工具，获取对象真实的内存地址 71c3b88c8   jps 32484
        System.out.println("对象z在内存中真实的内存地址为：" + Long.toHexString(VM.current().addressOf(z)));
        // 键盘录入，目的是为了程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu {
    // 父类私有成员变量
    private int a = 0x111;
    // 父类成员变量
    int b = 0x222;
    // 父类静态成员变量
    static int staticFu = 0x333;
}

class Zi extends Fu {
    // 子类成员变量
    int c = 0x444;
    int d = 0x555;
    // 子类静态成员变量
    static int staticZi = 0x666;
}