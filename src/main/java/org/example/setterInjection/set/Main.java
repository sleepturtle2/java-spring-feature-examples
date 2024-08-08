package org.example.setterInjection.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //Set bean example
        ClassPathXmlApplicationContext ctx3 = new ClassPathXmlApplicationContext("spring-core-config/set-config.xml");
        CarDealer cd = (CarDealer) ctx3.getBean("cardealer");
        System.out.println("Car dealer bean with set attributes : " + cd.toString());
    }
}
