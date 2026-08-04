package edu.hue.test3;

public class Test {
    public static void main(String[] args) {
        Pingpong_Athlete pa = new Pingpong_Athlete("张三", 18);
        pa.speakEng();
        pa.study();
        Pingpong_Coach pc = new Pingpong_Coach("王五", 30);
        pc.teach();
        pc.speakEng();
        Basketball_Athlete ba = new Basketball_Athlete("李四", 18);
        ba.study();
        Basketball_Coach bb = new Basketball_Coach("赵六", 30);
        bb.teach();
           }
}
