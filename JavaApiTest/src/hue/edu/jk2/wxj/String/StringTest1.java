package hue.edu.jk2.wxj.String;

public class StringTest1 {
    public static void main() {
        //1.直接赋值
        String str = "hello world";
        //2.使用构造方法
        //空参构造
        String str2 = new String();
        //有参构造
        String str3 = new String("hello world");
        //有参构造(字符数组)
        char[] chs = {'h','e','l','l','o'};
        String str4 = new String(chs);
        //有参构造(字节数组)
        byte[] bytes = {97,98,99,100,101};
        String str5 = new String(bytes);


    }
}
