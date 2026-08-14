package hue.edu.jk2.wxj.ArrayList;

import java.util.ArrayList;

public class Test2 {
    //包装类
    /*
    * 包装类：将基本数据类型转换为引用数据类型
    * 就是用对象包装起来
    * byte -> Byte
    * short -> Short
    * int -> Integer
    * long -> Long
    * float -> Float
    * double -> Double
    * char -> Character
    * boolean -> Boolean
    *
    *
    *
    * */
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.println(list.get(i) + "}");
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

}
