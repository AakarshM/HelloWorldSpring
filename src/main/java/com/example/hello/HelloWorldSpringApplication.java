package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloWorldSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Load spring config

		Coach currentCoach = context.getBean("myCoach", Coach.class);

		//Retrieve bean from spring container

		currentCoach.getWorkout();

		//Call methods on the bean
		context.close();
		
	}
}
