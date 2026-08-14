package hue.edu.jk2.wxj.tuomin;

import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        //1.定义一个敏感词词库(脏话)
        String[] arr = {" shit ", " damn ", " fuck ", "妈", "草"};
        //2.键盘录入测试
        Scanner sc = new Scanner(System.in);
        System.out.println("请说话");
        String str = sc.next();
        //3.替换其中敏感词,遍历敏感词词库这个数组
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "****");
        }
        System.out.println(str);

    }
}
