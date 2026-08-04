package edu.hue.test2;

public class Test {
    public static void main(String[] args) {
        //成员变量：编译看左边，运行也看左边
        //成员方法：编译看左边，运行看右边
        Fu f = new Zi();
        System.out.println(f.name);
        f.FuShow();
        f.show();
        Fu ff = new Zi();
        Zi z = (Zi) ff;
        System.out.println(z.name);
        z.ZiShow();//Zi类特有的方法
        z.show();
        Ye y = new Fu();
        if (y instanceof Fu){
            Fu fff = (Fu) y;
    }else {
            System.out.println("y不是Fu类的对象");
        }
    }
}
