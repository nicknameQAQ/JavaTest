package edu.hue.oopextendstest5;

public class Test {
    public static void main(String[] args) {
        //测试每个对象
        Tteacher tteacher = new Tteacher("张三", 30, "通识课");
        tteacher.teach();
        Zteacher zteacher = new Zteacher("李四", 35, "专业课");
        zteacher.teach();
        Bstudent bstudent = new Bstudent("王五", 20, "本科");
        bstudent.study();
        Sstudent sstudent = new Sstudent("赵六", 25, "硕士");
        sstudent.study();
    }
}
