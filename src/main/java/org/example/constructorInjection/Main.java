package org.example.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core-config/constructorInjection.xml");

        //Injection as value tag
        Student student = (Student) ctx.getBean("studentInjectAsValue");
        System.out.println("Injection with value element : " + student.toString());

        //Injection as c schema
        student = (Student) ctx.getBean("studentInjectAsCSchema");
        System.out.println("Injection with c schema: " + student.toString());


        //Type ambiguity resolution in constructor injection
        Ambiguity ambiguity = (Ambiguity) ctx.getBean("ambiguity-int");
        System.out.println("Integer constructor invoked: ");

        ambiguity = (Ambiguity) ctx.getBean("ambiguity-double");
        System.out.println("Double constructor invoked: ");

        ambiguity = (Ambiguity) ctx.getBean("ambiguity-string");
        System.out.println("String constructor invoked: ");

    }
}
