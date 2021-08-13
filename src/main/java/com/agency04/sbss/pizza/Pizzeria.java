package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PreDestroy;

//@Component
public class Pizzeria implements PizzeriaService
{
    @Value("${foo.name}")
    private String name;
    @Value("${foo.adress}")
    private String adress;
    private Pizza pizza;

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
