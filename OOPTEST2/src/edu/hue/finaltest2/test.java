package edu.hue.finaltest2;

public class test {
    public static void main(String[] args) {
        circle c = new circle(5);
        double area_c = c.getArea(5);
        double area_s = c.getPerimeter(5);
        System.out.println(area_c);
        System.out.println(c.getArea(5));
        System.out.println(area_s);
        System.out.println(c.getPerimeter(5));


    }


}
