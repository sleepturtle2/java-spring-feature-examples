package org.example.constructorInjection;

public class Student {
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    private Address address;

    Student(int id, Address address){
        this.id = id;
        this.address = address;
    }
}
