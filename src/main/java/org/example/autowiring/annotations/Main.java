package org.example.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){

        //Uses AutoWiring and Qualifier annotations
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core-config/autowiring-annotation-config.xml");
        TextEditor textEditor = (TextEditor) context.getBean("texteditor");
        System.out.println(textEditor.toString());
    }
}
