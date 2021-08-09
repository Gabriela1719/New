package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaDeliveryService
{

    PizzeriaService pizzeriaService;
    @Autowired
    public PizzaDeliveryService(@Qualifier("pizzeria") PizzeriaService _pizzeriaService)
    {
        this.pizzeriaService = _pizzeriaService;
    }
    @Autowired
    public void setPizzeriaService(@Qualifier("pizzeria2") PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }

    Pizza pizza;
    public String orderPizza(Pizza p)
    {
        this.pizza = p;
        return p.getName()+" "+p.getIngredients();
    }

}
