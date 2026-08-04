package edu.hue.test4;

public class InterImpl1 implements InterA, InterB {
    @Override
    public void method1(){
        System.out.println("调用了method1");
    };

    @Override
    public void method2(){
        System.out.println("调用了method2");
    };
    @Override
    public void method3(){
        System.out.println("重写了method3");
    };

}
