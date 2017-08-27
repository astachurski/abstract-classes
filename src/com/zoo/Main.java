package com.zoo;

public class Main {

    public static void main(String[] args) {

        Moveable myDogThatMoves = new Dog("pimpek");

        myDogThatMoves.crawl();
        myDogThatMoves.jump();
        myDogThatMoves.move();

        (new FitnessCenter()).testMoveability(myDogThatMoves);

        Singable myDogThatSings = new Dog("pimpek");
        myDogThatSings.singAsong();

        Animal myDogThatSings2 = new Dog("pimpek2");
        myDogThatSings2.singAsong();

        Singable somethingThatSings = (Singable)(myDogThatSings2);
        somethingThatSings.singAsong();



    }

}
