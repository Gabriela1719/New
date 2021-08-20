package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService
{
    public List<Customer> findAll();

    public Customer findById(String username);

    public void save(Customer theCustomer);

    public void deleteById(String username);
}
