package edu.hue.oopextendstest3;

public class Phone extends SmartDevice{
    //在此基础上再打九折
    @Override
    public double payment(){
        double payment = super.payment();
        return payment * 0.9;

    }

}
