package com.example.hello;

import javax.sound.midi.Track;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class TrackCoach implements Coach{

    private FortuneService fService;

    TrackCoach(FortuneService fService){
        System.out.println("Calling Track coach constructor with ref of fService: " + fService);
        this.fService = fService;
    }

    @Override
    public void getWorkout(){
        System.out.println("Track run today!");
    }

    @Override
    public void getFortune(){
        System.out.println("Track Coach: ");
        fService.getFortune();
    }

    //Init method
    public void doStartup(){
        System.out.println("Track Coach: Starting up");
    }

    //Destroy method
    public void doCleanUp(){
        System.out.println("Track Coach: Cleaning up");
    }

}
