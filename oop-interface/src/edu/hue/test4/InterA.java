package edu.hue.test4;

public interface InterA {
    void method1();
    void method2();
    default void method3(){
        System.out.println("调用了InterA的method3");
    }
}
