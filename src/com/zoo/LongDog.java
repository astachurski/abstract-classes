package com.zoo;

public class LongDog extends Dog{

    public String bubububu ;

    public LongDog(String name) {
        super(name);
    }



    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("long dog noise");
    }

    @Override
    public void sayName() {
        //super.sayName();
        System.out.println("long dog name: " + getName());
    }

    @Override
    public void move() {
        super.move();
    }
}
