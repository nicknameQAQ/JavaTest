package hue.edu.jk2.wxj.tuomin;

public class Test2_1 {
    public static void main(String[] args) {
        //敏感词过滤(replace)
        /*
        substring和replace的区别
        substring:截取固定位置的字符串
        replace:位置不确定,替换字符串中的字符


        */
        //1.定义字符串
        String str = "java好难学啊!!!TMD";
        //2.截取字符串
        String tempStr = str.replace("TMD", "****");
        System.out.println(tempStr);


    }
}
