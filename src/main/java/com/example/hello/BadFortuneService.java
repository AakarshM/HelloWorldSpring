package com.example.hello;

/**
 * Created by Aakarsh on 8/13/17.
 */
public class BadFortuneService implements FortuneService {

    @Override
    public void getFortune(){
        System.out.println("Today is not the lucky today, ayy");
    }
}
