package hue.edu.jk2.wxj.lianxi;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入字符串,并且将字符串反转,当输入拜拜的时候停止
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个字符串：");
            String s = sc.nextLine();
            if (s.equals("拜拜")){
                break;
            }
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String res = sb.toString();
            System.out.println(res);
        }
    }
}
