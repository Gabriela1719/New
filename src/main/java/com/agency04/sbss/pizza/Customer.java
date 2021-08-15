package com.agency04.sbss.pizza;

import org.springframework.stereotype.Component;

@Component
public class Customer
{
    private String username;

    public Customer(String username)
    {
        this.username = username;
    }
    private Customer(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
