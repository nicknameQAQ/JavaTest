package edu.hue.test1;

public class Person {
    //属性
    private String name;
    private String account;
    private String password;
    //行为
    public void work(){
        System.out.println("行为");
    }
    //无参构造方法
    public Person() {
    }
    //带参构造方法
    public Person(String name, String account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
