package com.example.jpatraining.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Customer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @JsonProperty("id")
    private int customerId ;
    @JsonProperty("Firstname")
    private String customerFirstname;
    @JsonProperty("Lastname")
    private String customerLastname;
    @JsonProperty("Email")
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerFirstname() {
        return customerFirstname;
    }
    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }
    public String getCustomerLastname() {
        return customerLastname;
    }
    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}

