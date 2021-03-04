package com.rsky.retailer.embadableClasses;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String country;
    private String state;
    private String street;
    private String postelCode;



    public Address() {
    }

    public Address(String country, String state, String street, String postelCode) {
        this.country = country;
        this.state = state;
        this.street = street;
        this.postelCode = postelCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostelCode() {
        return this.postelCode;
    }

    public void setPostelCode(String postelCode) {
        this.postelCode = postelCode;
    }
}