package com.agency04.sbss.pizza.Model;

public enum Size {
    SMALL ("small"),
    MEDIUM ("medium"),
    LARGE ("large");

    private final String value;

    Size(final String value){

        this.value = value;
    }
    public String getValue(){return value;}
}
