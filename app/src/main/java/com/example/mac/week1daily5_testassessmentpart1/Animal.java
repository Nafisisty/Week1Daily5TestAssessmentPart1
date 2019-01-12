package com.example.mac.week1daily5_testassessmentpart1;

public class Animal {

    public int energyLevel = 0;

    public void makingsound(){

        energyLevel = energyLevel - 3;
    }

    public void sleeping(){

        energyLevel = energyLevel + 10;
    }

    public void eating(String food) {

        energyLevel = energyLevel + 5;
    }
}
