package edu.hue.oopextendstest2;

public class Test {
    public static void main(String[] args) {
        /*
        三代智能手机



        */
        //第一代智能手机
        FirstGenerationPhone f1 = new FirstGenerationPhone();
        f1.call();
        System.out.println("-------------------------------");
        //第二代智能手机
        SecondGenerationPhone s1 = new SecondGenerationPhone();
        s1.call();
        s1.sendMessage();
        //第三代智能手机
        ThirdGenerationPhone t1 = new ThirdGenerationPhone();
        System.out.println("-------------------------------");
        t1.call();
        t1.sendMessage();
        t1.playGames();
    }
}
