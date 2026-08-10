package hue.edu.jk2.wxj.Test;

public class Test2 {
    //拼接字符串
    //定义一个方法,把int数组中的数据按照指定格式拼接成字符串返回
    //arr{1,2,3,4,5} ->拼接成[1,2,3,4,5]
    /*public static void concatArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i]) + ",");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        concatArray(arr);
    }*/
    static void main(String[] args) {
        //1.定义一个int数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.定义一个字符串进行拼接
        //String str = "";
        //不知道字符串赋值什么,所以用长度为0的字符串
        //str += "[";
        String str = "[";
        //3.遍历数组,把数组中的数据拼接成字符串
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                str += arr[i] + "]";
            }else {
                str += arr[i] + ",";

            }
        }
        System.out.println(str);


    }
}
