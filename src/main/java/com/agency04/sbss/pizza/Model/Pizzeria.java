package com.agency04.sbss.pizza.Model;

import com.agency04.sbss.pizza.Model.Pizza;
import com.agency04.sbss.pizza.Service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;

public class Pizzeria implements PizzeriaService
{
    @Value("${foo.name}")
    private String name;
    @Value("${foo.adress}")
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
        return getName() + " (" + getAdress() + ") \n" + pizza.getName()+"-"+pizza.getIngredients() +"\n";
  }
}
