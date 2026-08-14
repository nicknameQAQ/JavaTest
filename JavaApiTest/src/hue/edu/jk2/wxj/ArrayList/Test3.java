package hue.edu.jk2.wxj.ArrayList;

import java.util.ArrayList;

public class Test3 {
    /*
    *需求：定义一个集合，添加一些学生对象学生类的属性为：id，姓名，年龄。
    *要求：
    *遍历集合，将所有学生的属性打印在控制台上，每个学生一行
    *定义一个方法，根据 id 查找学生的信息。
    *存在：返回索引
    *不存在：返回 - 1
*/
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.添加学生对象
        list.add(new Student("001", "张三", 18));
        list.add(new Student("002", "李四", 19));
        list.add(new Student("003", "王五", 20));
        //3.遍历集合，将所有学生的属性打印在控制台上，每个学生一行
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
        //4.查找对应的id
        int index = findStudentById("002", list);
        System.out.println(index);
    }
    //定义一个方法，根据 id 查找学生的信息。
    //存在：返回索引
    //不存在：返回 - 1
    public static int findStudentById(String id, ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
