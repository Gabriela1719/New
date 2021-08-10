package com.agency04.sbss.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);
        PizzaDeliveryService pizzaDeliveryService = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        Margarita p = new Margarita();
        System.out.println(pizzaDeliveryService.orderPizza(p));
        Pizzeria pizzeria = context.getBean("pizzeria",Pizzeria.class);
        System.out.println(pizzeria.getName());
        System.out.println(pizzeria.getAdress());
        Pizzeria2 pizzeria2 = context.getBean("pizzeria2",Pizzeria2.class);
        System.out.println(pizzeria2.getName());
        System.out.println(pizzeria2.getAdress());

        context.close();
    }

}
