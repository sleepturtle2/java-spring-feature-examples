package org.example.lifecycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient3 {

        public int getId() {
            return id;
        }

        public void setId(int id) {
            System.out.println("Inside the setter method");
            this.id = id;
        }

        private int id;

        @PostConstruct
        //Note how method name need not be init
        public void psuedoInit(){
            System.out.println("Inside init method");
        }

        @Override
        public String toString() {
            return "Patient3{" +
                    "id=" + id +
                    '}';
        }

        @PreDestroy
        //Note how method name might even be destroy, without overriding
        public void psuedoDestroy() {
            System.out.println("Inside destroy method");
        }
}
