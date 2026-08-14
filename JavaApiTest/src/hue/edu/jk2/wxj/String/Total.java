package hue.edu.jk2.wxj.String;

public class Total {
        /*
        string类常用方法
        比较 equals equalsIgnoreCase
        长度 length
        获取单个字符 charAt
        截取 substring
        替换 replace

        是否包含 contains
        判断开头结尾 startsWith, endsWith
        查找 indexOf, lastIndexOf
        判断是否为空 isEmpty
        转字符数组 toCharArray
        大小写转换 toUpperCase toLowerCase
        去除空格 trim


        */
        //Contains
        // 可与敏感词过滤配合使用
    public static void main(String[] args) {
        String str = "qwerasdfzxcva";
        boolean contains = str.contains("asd");
        System.out.println("contains: " + contains);
        //startwith
        boolean startsWith = str.startsWith("qwe");
        System.out.println("startsWith: " + startsWith);
        boolean startsWith2 = str.startsWith("qwe", 2);
        System.out.println("startsWith2: " + startsWith2);
        //endwith
        // 可判断文件后缀名
        boolean endsWith = str.endsWith("zxcv");
        System.out.println("endsWith: " + endsWith);
        //indexOf
        //查找当前字符串第一次出现的索引,如果查找的不存在,那就返回-1
        int indexOf = str.indexOf(97);
        System.out.println("indexOf: " + indexOf);
        int indexOf2 = str.indexOf("we");
        System.out.println("indexOf2: " + indexOf2);
        //lastIndexOf
        //查找当前字符串最后一次出现的索引,如果查找的不存在,那就返回-1
        int lastIndexOf = str.lastIndexOf("a");
        System.out.println("lastIndexOf: " + lastIndexOf);
        //isEmpty
        //判断是否为空
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty: " + isEmpty);
        String strTemp = "";
        boolean isEmpty2 = strTemp.isEmpty();
        System.out.println("isEmpty2: " + isEmpty2);
        //toCharArray
        //转字符数组
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print("charArray[" + i + "]: " + charArray[i]);
        }
        //toUpperCase
        //转大写
        String upperCase = str.toUpperCase();
        System.out.println("upperCase: " + upperCase);
        //toLowerCase
        //转小写
        String lowerCase = str.toLowerCase();
        System.out.println("lowerCase: " + lowerCase);
        //trim
        //去除头尾空格
        String strTrim = " ad c ";
        System.out.println("我" + strTrim + "我");
        String trim = strTrim.trim();
        System.out.println("我" + trim + "我");









    }
}
