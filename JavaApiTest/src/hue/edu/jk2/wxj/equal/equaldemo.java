package hue.edu.jk2.wxj.equal;

public class equaldemo {
    public static void main(String[] args) {
        //equals方法,必须完全一致,才能返回true,否则返回false
        String userName = "zhangsan";
        String rightUserName = "zhangsan";
        String falseUserName = "Zhangsan";
        boolean result1 = userName.equals(rightUserName);
        boolean result2 = falseUserName.equals(userName);
        System.out.println(result1);
        System.out.println(result2);
        //equalsIgnoreCase方法,与equals方法类似,只是在比较时,不区分大小写
        boolean result3 = userName.equalsIgnoreCase(rightUserName);
        boolean result4 = falseUserName.equalsIgnoreCase(userName);
        System.out.println(result3);
        System.out.println(result4);


    }
}
