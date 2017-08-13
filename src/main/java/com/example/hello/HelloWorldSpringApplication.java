package com.example.hello;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloWorldSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloWorldSpringApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Load spring config

		Coach currentCoach = context.getBean("myCoach", Coach.class);
		CricketCoach otherCoach = context.getBean("otherCoach", CricketCoach.class);

		//Retrieve bean from spring container

		//Call methods on the bean
		currentCoach.getWorkout(); //Workout
		currentCoach.getFortune(); //Using bean

		System.out.println("Calling other coach next...");

		//Call mthods on the 2nd bean
		otherCoach.getWorkout();
		otherCoach.getFortune();
		otherCoach.getTeam();
		otherCoach.getEmail();

		//context.close();

	}
}
