package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");

       PizzaDeliveryService thePizzaDelivery = context.getBean(PizzaDeliveryService.class);
       Margarita p = new Margarita();
       System.out.println(thePizzaDelivery.orderPizza(p));
       Pizzeria pizzeria = context.getBean("pizzeria",Pizzeria.class);
       System.out.println(pizzeria.getName());
       System.out.println(pizzeria.getAdress());
        Pizzeria2 pizzeria2 = context.getBean("pizzeria2",Pizzeria2.class);
        System.out.println(pizzeria2.getName());
        System.out.println(pizzeria2.getAdress());

        context.close();
    }

}
