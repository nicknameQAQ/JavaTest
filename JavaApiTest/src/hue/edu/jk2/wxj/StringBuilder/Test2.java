package hue.edu.jk2.wxj.StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        //StringBuilder是Java中用于拼接字符串的一个工具类,可以让我们在拼接字符串时更加方便
        long startTime = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            s.append("abc");
        }
        System.out.println(s);
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");


    }
}
