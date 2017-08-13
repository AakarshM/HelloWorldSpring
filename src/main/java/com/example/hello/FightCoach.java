package com.example.hello;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class FightCoach implements Coach{

    private FortuneService fService;

    FightCoach(FortuneService fService){
        this.fService = fService;
    }

    @Override
    public void getWorkout(){
        System.out.println("Fight tonight!");
    }

    @Override
    public void getFortune(){
        fService.getFortune();
    }
}
