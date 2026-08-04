package edu.hue.test5;

public interface inter {
    default void method1(){
        System.out.println("调用了inter的method1");
        //System.out.println("1");
        function1();
    }
    default void method2(){
        System.out.println("调用了inter的method2");
        //System.out.println("1");
        function1();
    }
    static void method3(){
        System.out.println("调用了inter的method3");
        //System.out.println("2");
        function2();
    }
    static void method4(){
        System.out.println("调用了inter的method4");
        //System.out.println("2");
        function2();
    }
    private void function1(){
        System.out.println("1");
    }
    private static void function2(){
        System.out.println("2");
    }
}
