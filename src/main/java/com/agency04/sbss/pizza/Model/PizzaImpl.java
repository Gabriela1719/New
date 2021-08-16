package com.agency04.sbss.pizza.Model;

import com.agency04.sbss.pizza.Model.Pizza;
import org.springframework.stereotype.Component;

@Component
public class PizzaImpl implements Pizza
{
    private String name;
    private String ingredients;

    public PizzaImpl(){}
    public PizzaImpl(String name, String ingredients){
        this.name=name;
        this.ingredients=ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }
}
