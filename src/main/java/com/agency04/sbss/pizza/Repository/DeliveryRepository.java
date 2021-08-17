package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
