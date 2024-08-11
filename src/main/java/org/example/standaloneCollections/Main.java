package org.example.standaloneCollections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-core-config/standaloneCollection-list.xml");

        ProductsList productsList = (ProductsList) context.getBean("productlist");
        System.out.println(productsList.toString());
    }
}
