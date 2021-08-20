package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{
}
