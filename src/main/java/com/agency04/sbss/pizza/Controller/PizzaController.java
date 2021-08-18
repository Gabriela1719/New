package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Model.Pizza;
import com.agency04.sbss.pizza.Service.CustomerService;
import com.agency04.sbss.pizza.Service.DeliveryService;
import com.agency04.sbss.pizza.Service.PizzaService;
import com.agency04.sbss.pizza.Service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController
{
    @Autowired
    PizzeriaService pizzeriaService;
    PizzaService pizzaService;

    @GetMapping("/pizza")
    public List<Pizza> getPizza(){
        return pizzaService.findAll();
    }


    @GetMapping("/pizzeria")
    public String getAll()
    {
        return pizzeriaService.getName()+" - "+pizzeriaService.getAdress();
    }


}
