package org.example.setterInjection.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //List bean example
        ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("spring-core-config/list-config.xml");
        Hospital hosp = (Hospital) ctx2.getBean("hospital");
        System.out.println("Hospital bean with list attributes: " + hosp.toString());
    }
}
