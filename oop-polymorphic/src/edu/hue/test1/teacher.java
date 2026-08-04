package edu.hue.test1;

public class teacher extends Person{
    //构造方法
    public teacher() {
    }

    public teacher(String name, String account, String password) {
        super(name, account, password);
    }
    //行为
    @Override
    public void work(){
        System.out.println("教师的工作是教学");
    }
}
