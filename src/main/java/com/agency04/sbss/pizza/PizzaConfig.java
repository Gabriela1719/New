package com.agency04.sbss.pizza;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig
{
    @Bean
    @Primary
    public PizzeriaService pizzeria()
    {
        return new Pizzeria();
    }

}
