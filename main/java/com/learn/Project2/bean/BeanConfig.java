package com.learn.Project2.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Movie m1(){
		return new Movie(101, "Stranger Things", 2018, "English", 3);
		
	}
	@Bean
	public Movie m2() {
		return new Movie(102, "Vampire Diaries", 2013, "Eng", 4);
	}
	
	@Bean
	public Actor a1() {
		return new Actor(21, "Steve", "Harrington", 'M');
	}
	
	@Bean
	public Actor a2() {
		return new Actor(22, "Nancy", "Wheeler", 'F');
	}
	

}
