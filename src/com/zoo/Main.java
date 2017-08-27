package com.zoo;

public class Main {

    public static void main(String[] args) {

        Animal myAnimal = new Dog("pimpek");
        myAnimal.sayName();
        myAnimal.makeNoise();

        Animal myAnimal2 = new LongDog("pimpek");
        myAnimal2.makeNoise();
        myAnimal2.sayName();

        ((LongDog)myAnimal2).jump();
        ((Dog)myAnimal2).jump();

        Dog ld = new LongDog("bububu");
        ld.jump();

        LongDog ld2 = new LongDog("pikus");
        ld2.jump();


       // myAnimal2.





    }
}
