package edu.hue.test1;

public class Admin extends Person{
    //构造方法
    public Admin() {
    }

    public Admin(String name, String account, String password) {
        super(name, account, password);
    }
    //行为
    @Override
    public void work(){
        System.out.println("管理员的工作是管理");
    }
}
