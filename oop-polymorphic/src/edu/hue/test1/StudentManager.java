package edu.hue.test1;

public class StudentManager {
    //注册用户
    public void register(Person person){
        System.out.println("姓名为"+person.getName()+"的账号注册成功,账号为"+person.getAccount()+",密码为"+person.getPassword());
        person.work();
    }
}
