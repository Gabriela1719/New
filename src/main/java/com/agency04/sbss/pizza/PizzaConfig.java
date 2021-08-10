package com.agency04.sbss.pizza;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.agency04.sbss.pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig
{
    @Bean
    @Primary
    public PizzeriaService pizzeria()
    {
        return new Pizzeria();
    }
    @Bean
    public PizzeriaService pizzeria2()
    {
        return new Pizzeria2();
    }
    @Bean
    public PizzaDeliveryService pizzaDeliveryService()
    {
        return new PizzaDeliveryService(pizzeria());
    }
}
