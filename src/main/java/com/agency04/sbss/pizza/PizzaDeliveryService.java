package com.agency04.sbss.pizza;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PizzaDeliveryService
{
    PizzeriaService pizzeriaService;
    public PizzaDeliveryService(PizzeriaService _pizzeriaService)
    {
        this.pizzeriaService = _pizzeriaService;
    }

    public PizzaDeliveryService() {
    }
    Pizza pizza;
    public String orderPizza(Pizza p)
    {
        this.pizza = p;
        return p.getName()+" "+p.getIngredients();
    }
    @PostConstruct
    public void order()
    {
        System.out.println("Your order is");
    }

    @PreDestroy
    public void orderData()
    {
        System.out.println("Your order has been received");
    }
}
