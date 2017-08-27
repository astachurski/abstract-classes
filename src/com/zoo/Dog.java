package com.zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("hau hau!");
    }

    @Override
    public void sayName() {
        makeNoise();
        System.out.println("I'm dog, my name is:" + getName());
    }

    @Override
    public void move() {
        System.out.println("jumping like dog...");
    }

    public void jump(){
        System.out.println("I'm jumping");
    }


}
