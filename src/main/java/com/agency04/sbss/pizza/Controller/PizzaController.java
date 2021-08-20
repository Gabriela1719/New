package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Pizza;
import com.agency04.sbss.pizza.Service.PizzaService;
import com.agency04.sbss.pizza.Service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController
{
    @Autowired
    private PizzeriaService pizzeriaService;
    @Autowired
    private PizzaService pizzaService;

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
