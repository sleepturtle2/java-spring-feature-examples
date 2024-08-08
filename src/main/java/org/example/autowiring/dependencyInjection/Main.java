package org.example.autowiring.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core-config/autowiring-config.xml");
        //Address address = (Address) context.getBean("address");
        //System.out.println(address.toString());

        //Setter Injections using Autowiring

        //Autowiring by type
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());

        //Autowiring by name
        person = (Person) context.getBean("person1");
        System.out.println(person.toString());


        //Constructor injections using AutoWiring
        person = (Person) context.getBean("person3");
        System.out.println(person.toString());

    }
}
