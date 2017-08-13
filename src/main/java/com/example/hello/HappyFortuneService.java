package com.example.hello;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class HappyFortuneService implements FortuneService{
    @Override
    public void getFortune(){
        System.out.println("Fortune is today!");
    }
}
