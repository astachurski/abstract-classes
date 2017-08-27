package com.zoo;

public class Animal implements Singable{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayName(){
        System.out.println("myName is: " + name);
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {

    }

    @Override
    public void singAsong() {
        System.out.println("I'm animal - Tra lala la la la la !!!");

    }
}
