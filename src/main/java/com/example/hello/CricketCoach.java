package com.example.hello;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class CricketCoach implements Coach {
    private FortuneService fService;

    CricketCoach(){}

    @Override
    public void getWorkout(){
        System.out.println("Cricket practice today!");
    }

    @Override
    public void getFortune(){
        System.out.print("Cricket Coach: ");
        fService.getFortune();
    }

    public void setfService(FortuneService fService){
        this.fService = fService;
    }

}
