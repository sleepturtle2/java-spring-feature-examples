package org.example.setterInjection.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //Property bean example
        ClassPathXmlApplicationContext ctx5 = new ClassPathXmlApplicationContext("spring-core-config/prop-config.xml");
        CountriesAndLanguages cnl = (CountriesAndLanguages) ctx5.getBean("countriesAndLangs");
        System.out.println("Country and Languages injected as properties: " + cnl.toString());
    }
}
