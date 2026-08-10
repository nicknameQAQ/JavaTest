package hue.edu.jk2.wxj.bianli;
import java.util.Scanner;
public class bianli2 {
    static void main(String[] args) {
        //键盘录入一个字符串,遍历字符串,打印每个字符
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        //2.遍历字符串,打印每个字符
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
        System.out.println();
    }

}
