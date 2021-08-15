package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("pizzaDeliveryService")
public class PizzaDeliveryService
{
    @Autowired
    @Qualifier("pizzeria")
    PizzeriaService pizzeriaService;

    public PizzaDeliveryService(PizzeriaService _pizzeriaService)
    {
        this.pizzeriaService = _pizzeriaService;
    }


    public String orderPizza(Pizza pizza)
    {
        return pizzeriaService.makePizza(pizza) + "Your order should arrive soon";
    }
    @PostConstruct
    public void order()
    {
        System.out.println("Your order is preparing");
    }
    @PreDestroy
    public void orderData()
    {
        System.out.println("Your order has been received");
    }
}
