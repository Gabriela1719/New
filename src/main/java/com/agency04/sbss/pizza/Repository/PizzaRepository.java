package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>
{

}
