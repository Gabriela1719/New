package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
