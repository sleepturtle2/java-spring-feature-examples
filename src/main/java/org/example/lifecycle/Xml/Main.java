package org.example.lifecycle.Xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //XML Lifecycle method example
        AbstractApplicationContext ctx7 = new ClassPathXmlApplicationContext("spring-core-config/xml-lifecycle.xml");
        Patient patient = (Patient) ctx7.getBean("patient");
        System.out.println("Patient bean lifecycle: " + patient.toString());
        //pre-shutdown hook to invoke the destroy method
        ctx7.registerShutdownHook();
    }
}
