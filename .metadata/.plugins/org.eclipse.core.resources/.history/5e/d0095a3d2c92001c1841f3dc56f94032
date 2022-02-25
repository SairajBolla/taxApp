package com.abc.springdemo3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.springdemo3.bean.Greetings;
import com.abc.springdemo3.config.AppConfig;

public class GreetingsMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Greetings greetings = context.getBean(Greetings.class);
		Greetings greetings = (Greetings) context.getBean("bean2");
		greetings.sayHello();

	}

}
