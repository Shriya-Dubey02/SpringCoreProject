package com.learn.Project2.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
		
		Movie m1=context.getBean("movie",Movie.class);
		System.out.println(m1);
		
		Actor a1=context.getBean("actor",Actor.class);
		System.out.println(a1);
	}

}
