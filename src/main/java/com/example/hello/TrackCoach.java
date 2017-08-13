package com.example.hello;

import javax.sound.midi.Track;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class TrackCoach implements Coach{

    private FortuneService fService;

    TrackCoach(FortuneService fService){
        this.fService = fService;
    }

    @Override
    public void getWorkout(){
        System.out.println("Track run today!");
    }

    @Override
    public void getFortune(){
        System.out.print("Track Coach: ");
        fService.getFortune();
    }

}
