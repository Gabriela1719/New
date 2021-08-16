package com.agency04.sbss.pizza.Model;

import org.springframework.stereotype.Component;

public class Customer
{
    private int id;
    private String username;
    public Customer(int id, String username)
    {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
