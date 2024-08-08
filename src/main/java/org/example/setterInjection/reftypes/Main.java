package org.example.setterInjection.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){
        //Reference type bean example
        ClassPathXmlApplicationContext ctx6 = new ClassPathXmlApplicationContext("spring-core-config/reftype-config.xml");
        Student student = (Student) ctx6.getBean("student");
        System.out.println("Student [refers to Scores bean] : " + student.toString() );
    }
}
