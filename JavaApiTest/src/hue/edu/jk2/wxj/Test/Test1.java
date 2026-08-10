package hue.edu.jk2.wxj.Test;

import java.util.Scanner;

public class Test1 {
    /*
    * 键盘录入一个字符串,统计该字符串中大写字母,小写字母,数字的出现次数,不考虑其他字符
    * */
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        //2.遍历字符串,统计每个字符的出现次数
        //用ascii码表判断字符是否为大写字母,小写字母,数字
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                countUpper++;
            } else if (c >= 'a' && c <= 'z') {
                countLower++;
            } else if (c >= '0' && c <= '9') {
                countDigit++;
            }
        }
        System.out.println("大写字母出现次数" + countUpper);
        System.out.println("小写字母出现次数" + countLower);
        System.out.println("数字出现次数" + countDigit);


    }
}
