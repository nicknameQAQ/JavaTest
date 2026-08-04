package edu.hue.oopextendstest5;

public class Teacher extends Person {
    private String subject;
    public void teach(){
        System.out.println("在教学");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
