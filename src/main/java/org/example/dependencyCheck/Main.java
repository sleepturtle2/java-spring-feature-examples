package org.example.dependencyCheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        //Spring Dependency Check example
        AbstractApplicationContext ctx10 = new ClassPathXmlApplicationContext("spring-core-config/dependencyCheck-config.xml");
        Prescription prescription = (Prescription) ctx10.getBean("prescription");
        //@Required dependency check is not enforced unless annotation is not enabled
        System.out.println("Prescription dependency check example: " + prescription.toString());

        //Note how the destroy method from earlier gets printed at the end, irrespective of the sleep time introduced.
    }
}
