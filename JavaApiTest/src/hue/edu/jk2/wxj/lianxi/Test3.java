package hue.edu.jk2.wxj.lianxi;

import java.util.Scanner;

public class Test3 {
    /*
    * 多种解法
    * https://www.bilibili.com/video/BV1TJxCzSEEZ?spm_id_from=333.788.videopod.episodes&vd_source=576e958b1b41835af816e7211239f7ce&p=130*/
    //字符串分离
    //键盘录入任意字符串,请按长度为8拆分每个输入字符串并进行输出
    //长度不是8的在其后面补0,空字符串不处理
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        char[] ca = str.toCharArray();
        for (int i = 0; i < ca.length; i += 8) {
            for (int j = i; j < i + 8; j++) {
                if(j < ca.length){
                    System.out.print(ca[j]);
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }

    }
}
