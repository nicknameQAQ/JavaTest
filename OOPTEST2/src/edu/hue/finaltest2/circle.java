package edu.hue.finaltest2;

public class circle {
    //定义一个JavaBean类描述圆
    //属性: 半径和圆周率
    //行为: 计算圆的面积和周长


    //定义属性
    private final double rate = 3.14;
    private double r;
    //提供行为
    //求面积
    public double getArea(double r){
        return rate * r * r;
    }
    //求周长
    public double getPerimeter(double r){
        return 2 * rate * r;
    }

    //提供构造方法

    public circle(double r) {
        this.r = r;
    }

    public circle() {
    }

    //get,set方法

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getRate() {
        return rate;
    }
}
