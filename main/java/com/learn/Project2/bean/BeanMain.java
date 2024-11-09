package com.learn.Project2.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Movie movie1=context.getBean("m1",Movie.class);
		System.out.println(movie1);
		
		Actor actor1=context.getBean("a1",Actor.class);
		System.out.println(actor1);
		
		System.out.println(context.getBean("a2",Actor.class));
		
		System.out.println(context.getBean("m2",Movie.class));
	}

}
