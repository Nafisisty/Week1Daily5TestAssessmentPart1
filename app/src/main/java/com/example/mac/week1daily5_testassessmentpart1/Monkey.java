package com.example.mac.week1daily5_testassessmentpart1;

public class Monkey extends Animal {

    private int numberofMonkeys = 5;

    @Override
    public void eating(String food) {
        energyLevel = energyLevel + 2;
    }

    @Override
    public void makingsound() {
        energyLevel = energyLevel - 4;
    }

    public void play(){

        if(energyLevel > 8) {
            System.out.println("Oooo Oooo Oooo");
            energyLevel = energyLevel - 8;
        }
        else
            System.out.println("Monkey is too tired");
    }
}
