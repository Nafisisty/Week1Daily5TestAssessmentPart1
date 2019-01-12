package com.example.mac.week1daily5_testassessmentpart1;

public class Jungle {


    public static void main(String[] args){

        String meat = "meat";
        String fish = "fish";
        String bugs = "bugs";
        String grain = "grain";

//        System.out.println(animal.energyLevel);

        Snakes snakes = new Snakes();
        snakes.eating(bugs);

        snakes.sleeping();
        snakes.makingsound();

        System.out.println("Remaining energy level of snake " + snakes.energyLevel);

        Tiger tiger = new Tiger();
        tiger.sleeping();
        tiger.eating(meat);
        tiger.eating(fish);
        tiger.eating(grain);
        tiger.sleeping();
        tiger.eating(meat);
        tiger.makingsound();
        tiger.eating(meat);
        System.out.println("Remaining energy level of tiger " + tiger.energyLevel);

        Monkey monkey = new Monkey();
        monkey.eating(fish);
        monkey.eating(bugs);
        monkey.sleeping();
        monkey.play();
        monkey.play();
        System.out.println("Remaining energy level of monkey " + monkey.energyLevel);

    }
    public void soundOff(Animal animal){

        animal.makingsound();

    }
}


