package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{
}
