package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();

    public Customer findById(int theId);

    public void save(Customer theCustomer);

    public void deleteById(int theId);
}
