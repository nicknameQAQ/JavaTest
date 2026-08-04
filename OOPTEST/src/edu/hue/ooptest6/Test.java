package edu.hue.ooptest6;

public class Test {
    public static void main(String[] args) {
        /*构造方法注意事项
        * 1.如果没有定义构造方法,系统会自动提供一个默认的构造方法
        * 2.如果自己写了构造方法,系统就不会自动提供默认的构造方法
        * 3.带参构造方法和无参构造方法可以同时存在,两者方法名相同但参数不同,这叫做构造方法的重载
        * 4.无论是否习惯,都应该手动书写无参构造方法,和带参构造方法,以确保对象的属性被正确初始化
        *
        *
        *
        *
        * */
        Student stu1 = new Student();
        //大一
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.setHeight(183);
        stu1.setWeight(60);
        System.out.println("大一新生,"+ stu1.getName() + ","+ stu1.getAge()
                + ","+stu1.getHeight()+ "," + stu1.getWeight() + ",刚进大学努力学习");
        //大二
        stu1.setAge(stu1.getAge() + 1);
        stu1.setWeight(stu1.getWeight() + 10);
        System.out.println("大二,"+ stu1.getName() + ","+ stu1.getAge()
                + ","+stu1.getHeight()+ "," + stu1.getWeight());
        //大三
        stu1.setAge(stu1.getAge() + 1);
        stu1.setHeight(stu1.getHeight() + 2);
        stu1.setWeight(60 + 10 - 3);
        System.out.println("大三,"+ stu1.getName() + ","+ stu1.getAge()
                + ","+stu1.getHeight()+ "," + stu1.getWeight());

    }



}
