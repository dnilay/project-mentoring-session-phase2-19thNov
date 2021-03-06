package org.example.model;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;

    public Address() {
    }

    public Address(String addressLine1, String addressLine2, String city) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
