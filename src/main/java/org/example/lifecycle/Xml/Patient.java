package org.example.lifecycle.Xml;

public class Patient {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside the setter method");
        this.id = id;
    }

    private int id;

    //Note how method name need not be init
    public void psuedoInit(){
        System.out.println("Inside init method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    //Note how method name might even be destroy, without overriding
    public void psuedoDestroy(){
        System.out.println("Inside destroy method");
    }
}
