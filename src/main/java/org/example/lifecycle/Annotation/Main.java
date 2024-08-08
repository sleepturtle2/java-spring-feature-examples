package org.example.lifecycle.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){
        //Spring annotation lifecycle method example
        AbstractApplicationContext ctx9 = new ClassPathXmlApplicationContext("spring-core-config/annotation-lifecycle.xml");
        Patient3 patient3 = (Patient3) ctx9.getBean("patient3");
        System.out.println("Patient3 bean lifecycle with annotations : " + patient3.toString());
    }
}
