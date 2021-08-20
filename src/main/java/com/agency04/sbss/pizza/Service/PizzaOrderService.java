package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.PizzaOrder;

import java.util.List;

public interface PizzaOrderService
{
    public List<PizzaOrder> findAll();

    public PizzaOrder findById(int theId);

    public void save(PizzaOrder thePizzaOrder);

    public void deleteById(int theId);
}
