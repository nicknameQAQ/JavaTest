package hue.edu.jk2.wxj.lianxi;

public class Test1 {
    //Test包里的Test2类
    //定义一个方法,把int数组中的数据按照指定格式拼接成字符串返回
    //arr{1,2,3,4,5} ->拼接成[1,2,3,4,5]
    //要使用StringBuilder
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i] + "]");
            }else {
                sb.append(arr[i] + ",");
            }
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
