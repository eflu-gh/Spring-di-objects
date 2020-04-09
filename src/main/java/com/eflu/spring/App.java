package com.eflu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eflu.di.objects.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		System.out.println("After constructor...");
		Person person = context.getBean("myPerson", Person.class);
		System.out.println("Name: " + person.getName());
		System.out.println("Id: " + person.getId());
		System.out.println("Nickname: " + person.getNickName());
		System.out.println("Country: " + person.getCountry().getName());
		System.out.println("Team Soccer: " + person.getTeam().showTeamSoccer());
		((ClassPathXmlApplicationContext) context).close();
	}
}