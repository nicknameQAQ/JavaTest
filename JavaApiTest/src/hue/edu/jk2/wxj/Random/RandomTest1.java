package hue.edu.jk2.wxj.Random;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        // 生成0-99之间的随机数
        int i = r.nextInt(100);
        // 生成1-100之间的随机数
        int j = r.nextInt(99) + 1;
        System.out.println("1-100之间的随机数：" + j);
        //生成0.0-100.0之间的随机数(不包含100.0)
        Double k1 = r.nextDouble() * 100;
        //jdk17新增 [0.0,1.9)之间的随机数
        Double k2 = r.nextDouble(1.9);
        //jdk17新增 [1.2,1.9)之间的随机数
        Double k3 = r.nextDouble(1.2, 1.9);
    }
}
