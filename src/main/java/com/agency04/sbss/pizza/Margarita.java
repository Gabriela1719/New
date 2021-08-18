package com.agency04.sbss.pizza;


public class Margarita implements Pizza
{

    private final String name = "margarita";
    private final String ingredients = "Tomato sauce, mozzarella, and oregano";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }
}
