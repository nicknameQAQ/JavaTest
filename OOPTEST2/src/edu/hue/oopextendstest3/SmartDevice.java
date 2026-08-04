package edu.hue.oopextendstest3;

public class SmartDevice {
    String name;
    int price;
    public double payment(){
        /*
        * 0 <= price < 1000 不打折
        *1000 <= price < 5000 打九折
        * 5000 <= price <10000 打八折
        * 10000 <= price 打七折
        *
        * */
        if(0 <= price && price < 1000){
            return price;
        } else if (price >= 1000 && price < 5000) {
            return price * 0.9;
        } else if (price >= 5000 && price < 10000) {
            return price * 0.8;
        } else if (price >= 10000) {
            return price * 0.7;
        }else{
            return 0;
        }
    }
}
