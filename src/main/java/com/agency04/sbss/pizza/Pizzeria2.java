package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pizzeria2 implements PizzeriaService
{
    PizzeriaService pizzeriaService;
    @Value("${p.name}")
    private String name;
    @Value("${p.adress}")
    private String adress;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return "\n" + getName() + "(" + getAdress() + ")\n" + pizza.getName()+"-"+pizza.getIngredients();
    }
}

