package edu.hue.test1;

public class Test {
    public static void main(String[] args) {
        //创建一个学生管理对象
        StudentManager sm = new StudentManager();
        //创建一个学生
        Student s = new Student("张三","zhangsan","123456");
        //注册一个学生
        sm.register(s);
        //创建一个教师
        teacher t = new teacher("李四","lisi","123456");
        //注册一个教师
        sm.register(t);
    }
}
