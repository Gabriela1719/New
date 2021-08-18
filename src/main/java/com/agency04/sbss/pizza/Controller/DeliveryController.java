package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Service.CustomerService;
import com.agency04.sbss.pizza.Service.DeliveryService;
import com.agency04.sbss.pizza.Service.PizzaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DeliveryController
{
    DeliveryService deliveryService;
    CustomerService customerService;
    PizzaService pizzaService;
    @PostMapping("/delivery/order")
    public String deliverOrder()
    {
        return customerService.findAll()+ ", Your order is" + pizzaService.findAll();
    }
    @GetMapping("/delivery/list")
    public List<Delivery> getAllD()
    {
        return deliveryService.findAll();
    }
}
