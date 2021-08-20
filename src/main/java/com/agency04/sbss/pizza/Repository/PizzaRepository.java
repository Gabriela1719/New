package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>
{
}
