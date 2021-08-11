package com.agency04.sbss.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);
        PizzaDeliveryService pizzaDeliveryService = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        Pizzeria pizzeria = context.getBean("pizzeria",Pizzeria.class);
        Pizzeria2 pizzeria2 = context.getBean("pizzeria2",Pizzeria2.class);
        Margarita p = new Margarita();
        System.out.println(pizzeria.makePizza(p));
        System.out.println(pizzeria2.makePizza(p));
        context.close();
    }

}
