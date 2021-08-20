package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Pizza;

import java.util.List;

public interface PizzaService
{
    public List<Pizza> findAll();

    public Pizza findById(int theId);

    public void save(Pizza thePizza);

    public void deleteById(int theId);
}
