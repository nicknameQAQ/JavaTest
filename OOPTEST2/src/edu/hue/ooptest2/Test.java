package edu.hue.ooptest2;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "小万";
        stu1.age = 20;
        Student.teachername = "manba";
        stu2.name = "大万";
        stu2.age = 30;
        stu2.teachername = "manba";
        System.out.println(stu1.age);
        System.out.println(stu1.name);
        System.out.println(Student.teachername);
        System.out.println(stu1.teachername);
        System.out.println(stu2.teachername);

    }
}
