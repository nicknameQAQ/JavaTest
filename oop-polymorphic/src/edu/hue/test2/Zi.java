package edu.hue.test2;

public class Zi extends Fu{
    String name = "Zi";
    public void ZiShow(){
        System.out.println("调用了Zi类的ZiShow方法");
    }
    @Override
    public void show(){
        System.out.println("调用了Zi类的show方法");
    }
}
