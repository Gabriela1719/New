package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Integer> {
}
