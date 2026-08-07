package hue.edu.jk2.wxj.equal;

import java.util.Scanner;

public class equaldemo2 {
    static void main() {
        //创建一个登录界面,要求用户输入用户名和密码,判断是否登录成功
        //一共三次机会,登陆成功后,提示登录成功,否则提示登录失败,并提示用户重新输入
        //1.定义正确的用户名和密码
        String rightUserName = "zhangsan";
        String rightPassword = "123456";
        //2.定义用户输入的用户名和密码(从键盘输入)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String userName = sc.nextLine();
            System.out.println("请输入密码:");
            String password = sc.nextLine();
            if(rightUserName.equals(userName) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败您还有" + (2 - i) + "次机会");
            }
            while (i == 2) {
                System.out.println("三次登录机会用完");
                break;

            }
        }


    }
}
