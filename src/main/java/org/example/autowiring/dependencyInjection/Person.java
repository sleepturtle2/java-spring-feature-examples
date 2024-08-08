package org.example.autowiring.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private int id;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    private Address address;

    //If you are using autowiring, having parameterized constructors will throw errors
    //Several features/libraries like Hibernate, Serialization require a default constructor , so if you want to define
    //parameterized constructor, make sure you define a default too
    Person(int id, Address address){
        this.id = id;
        this.address = address;
    }

    Person(){
        this.id=-1;
        this.address=null;
    }
}
