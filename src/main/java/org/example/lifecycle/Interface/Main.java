package org.example.lifecycle.Interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //Spring Interface Lifecycle method example
        AbstractApplicationContext ctx8 = new ClassPathXmlApplicationContext("spring-core-config/springinterface-lifecycle.xml");
        Patient2 patient2 = (Patient2) ctx8.getBean("patient2");
        System.out.println("Patient2 bean lifecycle: " + patient2.toString());
        //no need to invoke destroy method explicitly in the new java versions
        //ctx8.registerShutdownHook();
    }
}
