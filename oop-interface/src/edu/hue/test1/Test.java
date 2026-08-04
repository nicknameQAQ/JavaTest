package edu.hue.test1;

import edu.hue.test2.inter;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙", "黄色");
        frog.eat();
        frog.swim();
        Dog dog = new Dog("狗", "黄色");
        dog.eat();
        dog.swim();
        Rabbit rabbit = new Rabbit("兔子", "黄色");
        rabbit.eat();
    }
}
