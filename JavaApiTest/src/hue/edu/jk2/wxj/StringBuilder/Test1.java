package hue.edu.jk2.wxj.StringBuilder;

public class Test1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += "abc";
        }
        System.out.println(s);
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
