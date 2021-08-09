package com.agency04.sbss.pizza;

public class Margarita implements Pizza
{
    private String name;
    private String ingredients;

    @Override
    public String getName() {
        return this.name="Margarita";
    }

    @Override
    public String getIngredients() {
        return this.ingredients = ingredients;
    }
}
