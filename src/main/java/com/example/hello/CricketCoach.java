package com.example.hello;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class CricketCoach implements Coach {
    private FortuneService fService;
    private String email;
    private String team;

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

    public void setEmail(String email){
        this.email = email;
    }

    public void setTeam(String team){
        this.team = team;
    }


    //Custom methods

    public void getTeam(){
        System.out.println("Cricket team: " + team);
    }

    public void getEmail(){
        System.out.println("Cricket email: " + email);
    }

}
