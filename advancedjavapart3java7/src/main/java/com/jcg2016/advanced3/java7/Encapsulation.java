package com.jcg2016.advanced3.java7;

public class Encapsulation {
    private final String email;
    private String address;
    
    public Encapsulation( final String email ) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
}
