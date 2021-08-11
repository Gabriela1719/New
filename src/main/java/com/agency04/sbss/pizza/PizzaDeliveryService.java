package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaDeliveryService
{

    @Autowired
    @Qualifier("pizzeria")
    PizzeriaService pizzeriaService;
    public PizzaDeliveryService(PizzeriaService _pizzeriaService)
    {
        this.pizzeriaService = _pizzeriaService;
    }
    @Autowired
    public void setPizzeriaService(@Qualifier("pizzeria2") PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }

    public String orderPizza(Pizza pizza)
    {
        return pizzeriaService.makePizza(pizza) + "Your order should arrive soon";
    }

}
