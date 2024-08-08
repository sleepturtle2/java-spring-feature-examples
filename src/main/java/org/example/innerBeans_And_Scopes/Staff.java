package org.example.innerBeans_And_Scopes;

public class Staff {
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

}
