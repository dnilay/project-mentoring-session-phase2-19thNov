package org.example.model;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isAlive;
    private Address address;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String email,boolean isAlive,Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isAlive=isAlive;
        this.address=address;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", email='" + email +"Address: "+address;

    }
}
