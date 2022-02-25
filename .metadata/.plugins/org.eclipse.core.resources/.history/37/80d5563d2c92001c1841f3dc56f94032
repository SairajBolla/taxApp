package com.abc.springdemo3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.springdemo3.bean.Greetings;

@Configuration
public class AppConfig {
	
	@Bean(name = "bean1")
	public Greetings getGreetingBean1() {
		Greetings greetings = new Greetings();
		greetings.setMsg("Hi spring..");
		return greetings;
	}
	
	@Bean(name="bean2")
	public Greetings getGreetingBean2() {
		Greetings greetings = new Greetings();
		greetings.setMsg("Hi spring boot..");
		return greetings;
	}

}
