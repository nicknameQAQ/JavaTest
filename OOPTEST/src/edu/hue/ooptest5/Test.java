package edu.hue.ooptest5;

public class Test {
    public static void main(String[] args) {
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
