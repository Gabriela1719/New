package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Service.CustomerService;
import com.agency04.sbss.pizza.Service.DeliveryService;
import com.agency04.sbss.pizza.Service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController
{
    @Autowired
    private DeliveryService deliveryService;
    @Autowired
    private PizzaService pizzaService;
    @PostMapping("/order")
    public void deliverOrder(@RequestBody Delivery theDelivery)
    {
        deliveryService.save(theDelivery);
        pizzaService.findAll();
    }
    @GetMapping("/list")
    public List<Delivery> getAllD()
    {
        return deliveryService.findAll();
    }
}
