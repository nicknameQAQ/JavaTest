package hue.edu.jk2.wxj.tuomin;

public class Test1 {
    //数据脱敏
    //String substring(int beginIndex, int endIndex) 截取
    //String substring(int beginIndex) 截取到字符串末尾
    //要求: 只保留用户名第一个字符,后面用三个*代替
    public static void main(String[] args) {
        //定义一个字符串
        //String str = "gouxie12345";
        //包头不包尾,包左不包右
        //System.out.println(str.substring(1,4));
        String str = "gouxie12345";
        System.out.println(str.substring(0,2)+"***");

    }

}
