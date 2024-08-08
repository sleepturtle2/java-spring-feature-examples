package org.example.beanExternalisation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core-config/beanExternalization-config.xml");
        DummyDao dummyDao = (DummyDao) context.getBean("dummyDao");
        System.out.println(dummyDao);
    }
}
