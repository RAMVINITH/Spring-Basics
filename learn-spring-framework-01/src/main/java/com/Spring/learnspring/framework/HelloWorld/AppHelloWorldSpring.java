package com.Spring.learnspring.framework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1 Launch a Spring Context
		var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	   //2 Configure the thing that we want spring to manage
		// HelloWordConfiguration - @Configuration
		//name -@Bean
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("address2"));
	}

}
