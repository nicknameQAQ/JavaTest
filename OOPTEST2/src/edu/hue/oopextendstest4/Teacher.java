package edu.hue.oopextendstest4;

public class Teacher extends Person{
    public String subject;

    public Teacher() {
        System.out.println("子类Teacher的无参构造方法执行了~");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        System.out.println("子类Teacher的有参构造方法执行了~");
        this.subject = subject;
    }
}
