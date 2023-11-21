package com.Spring.learnspring.framework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// record is a immutable class that we don't to need write getter, setter ,tostring method that are already inbuilded
record Person(String name,int age,Address address) {};
record Address(String street,String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name()
	{
		return "Vinith";
	}
	@Bean
	public int age()
	{
		return 23;
	}
	@Bean
	public Person person(String name,int age, Address address2)
	{
		return new Person(name,age,address2);
	}
//	@Bean (name="person2")
//	public Person person(String name,int age, Address address2)
//	{
//		return new Person(name,age,address2);
//	}
	@Bean 
	public Address address1()
	{
		return new Address("Guduvanchery","Chennai");
	}
	@Bean (name="address2")
	public Address address()
	{
		return new Address("Tnagar","Chennai");
	}
	

}
