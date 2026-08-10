package hue.edu.jk2.wxj.bianli;

public class bianli1 {
    static void main(String[] args) {
        //遍历字符串
        //public char charAt(int index)：返回指定索引的字符
        //public int length()：返回字符串的长度
        //与数组的:   数组.length调用应区别开来,没有小括号

        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }

    }

}
