package hue.edu.jk2.wxj.ArrayList;

import java.util.ArrayList;

public class Test1 {
    //练习没看12.10
    /*
     * ArrayList集合
     *     空参构造:
     *         ArrayList()           创建一个长度为0的集合
     *     常见方法:
     *         boolean add(E e)           添加数据
     *         void add(int index, E e)   添加数据
     *         boolean remove(E e)        删除元素
     *         E remove(int index)        删除元素
     *         E set(int index, E e)      修改元素
     *         E get(int index)           获取元素
     *         int size()                 集合长度
     */

    public static void main(String[] args) {
        //1.创建一个长度为0的ArrayList集合
        //无法确定存储类型
        //ArrayList list = new ArrayList();
        //利用泛型限制数据类型   <数据类型>
        //ArrayList<String> list = new ArrayList<String>();
        //在jdk7的时候，可以省略泛型的写法,但是尖括号必须保留
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        //细节1.不管添加什么数据都会成功,忽略返回值即可,为了保持一致性
        //细节2.无法添加基本数据类型,只能添加引用数据类型(对象)
        //如果一定要添加基本数据类型,可以使用包装类
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("直接添加:"+list);
        list.add( 3,"ddd");
        System.out.println("插入添加:"+list);
        //3.删除数据
        list.remove(3);
        System.out.println("索引删除:"+list);
        list.remove("aaa");
        System.out.println("元素删除:"+list);
        //4.修改数据
        //会返回修改前的数据
        String oldData = list.set(0,"www");
        System.out.println("修改前的数据:"+oldData);
        list.set(0,"www");
        System.out.println("修改数据:"+list);
        //5.查询数据
        String data = list.get(0);
        System.out.println("查询数据:"+data);
        //6.获取集合长度
        int size = list.size();
        System.out.println("集合长度:"+size);
        //7.遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }


    }


}
