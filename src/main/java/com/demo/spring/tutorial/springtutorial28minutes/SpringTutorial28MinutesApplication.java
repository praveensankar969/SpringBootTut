package com.demo.spring.tutorial.springtutorial28minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.spring.tutorial.springtutorial28minutes.scope.PersonDAO;

@SpringBootApplication
public class SpringTutorial28MinutesApplication {
	static Logger LOGGER = LoggerFactory.getLogger(SpringTutorial28MinutesApplication.class);

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(SpringTutorial28MinutesApplication.class, args);
		PersonDAO person = context.getBean(PersonDAO.class);
		System.out.println(person);
		System.out.println(person.getConnection());
		
		PersonDAO person1 = context.getBean(PersonDAO.class);
		System.out.println(person1);
		System.out.println(person1.getConnection());
		
	}

}
