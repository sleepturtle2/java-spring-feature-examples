package org.example.lifecycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient2 implements InitializingBean, DisposableBean {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside the setter method");
        this.id = id;
    }

    private int id;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
}
