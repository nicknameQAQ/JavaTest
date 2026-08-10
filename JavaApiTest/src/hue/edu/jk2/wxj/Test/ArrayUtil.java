package hue.edu.jk2.wxj.Test;

public class ArrayUtil {
    private ArrayUtil(){}//防止实例化，因为工具类不需要实例化
    public static String arrayToString(int[] array){
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
        return str;
    }

}
