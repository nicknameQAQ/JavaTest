package edu.hue.test4;

public interface InterB {
    default void method3(){
        System.out.println("调用了InterB的method3");
    }
}
