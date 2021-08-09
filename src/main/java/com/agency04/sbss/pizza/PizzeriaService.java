package com.agency04.sbss.pizza;

import org.springframework.stereotype.Component;

public interface PizzeriaService
{
    public String getName();
    public String getAdress();
    public String makePizza(Pizza p);
}
