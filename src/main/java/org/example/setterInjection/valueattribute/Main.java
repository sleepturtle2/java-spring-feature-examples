package org.example.setterInjection.valueattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core-config/config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        Employee emp2 = (Employee) ctx.getBean("emp2");
        Employee emp3 = (Employee) ctx.getBean("emp3");

        //Value as element
        System.out.println("Employee 1 [value as element]: " + emp.toString());

        //Value as attribute
        System.out.println("Employee 2 [value as attribute] : " + emp2.toString());

        //Value from p namespace
        System.out.println("Employee 3 [value from p schema] : " + emp3.toString());
}
}
