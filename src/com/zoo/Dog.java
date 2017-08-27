package com.zoo;

public class Dog extends Animal implements Moveable{

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
        System.out.println("I'm dog and I'm moving");

    }

    @Override
    public void jump() {
        System.out.println("I'm dog and I'm jumping");

    }

    @Override
    public void crawl() {
        System.out.println("I'm dog and I'm crawling");

    }
}
