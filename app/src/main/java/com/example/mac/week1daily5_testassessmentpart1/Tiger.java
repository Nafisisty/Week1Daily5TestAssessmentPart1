package com.example.mac.week1daily5_testassessmentpart1;

public class Tiger extends Animal {

    private int numberOfTigers = 10;

    @Override
    public void sleeping() {
        energyLevel = energyLevel + 5;

    }

    @Override
    public void eating(String food) {
        if(food != "grain")
            super.eating(food);


    }
}
