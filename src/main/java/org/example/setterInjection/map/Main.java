package org.example.setterInjection.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //Map bean example
        ClassPathXmlApplicationContext ctx4 = new ClassPathXmlApplicationContext("spring-core-config/map-config.xml");
        Customer cust = (Customer) ctx4.getBean("Customer");
        System.out.println("Customer bean, using maps: " + cust.toString());
    }
}
