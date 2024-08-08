package org.example.innerBeans_And_Scopes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){

        //Usage of inner bean example
        AbstractApplicationContext ctx11 = new ClassPathXmlApplicationContext("spring-core-config/innerBean-config.xml");
        Staff staff = (Staff) ctx11.getBean("employee");
        System.out.println("Using an inner bean of address: " + staff.toString());

        //Singleton bean scope example, by default all beans are singleton scoped
        //above staff bean is reused and checked if hash codes on both the objects are the same
        Staff staff2 = (Staff) ctx11.getBean("employee");
        System.out.println("Singleton scope demo \nStaff 1 hashcode: " + staff.hashCode() + ", Staff 2 hashcode: " + staff2.hashCode());


        //Prototype scope example
        Staff staff3 = (Staff) ctx11.getBean("employee-prototype");
        Staff staff4 = (Staff) ctx11.getBean("employee-prototype");
        System.out.println("Prototype scope demo \nStaff 3 hashcode: " + staff3.hashCode() + ", Staff 3 hashcode: " + staff4.hashCode());
    }
}
