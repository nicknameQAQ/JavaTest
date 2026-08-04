package edu.hue.ooptest4;

class Person {
    private String name;
    private int age;
    public void setName(String pername){
        name = pername;
    }
    public String getName(){
        return name;
    }
    public void setAge(int perage){
            if (perage > 0 && perage <= 100) {
                age = perage;
            } else {
                System.out.println("输入错误");
            }

    }
    public int getAge(){
        return age;
    }
}
