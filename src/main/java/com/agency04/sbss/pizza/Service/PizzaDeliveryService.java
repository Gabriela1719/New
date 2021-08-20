package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
@Service("pizzaDeliveryService")
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

    @PreDestroy
    public void orderData()
    {
        System.out.println("Your order has been received");
    }


}
