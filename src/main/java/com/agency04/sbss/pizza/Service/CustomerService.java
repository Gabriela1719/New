package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

    public String deliverOrder(Customer customer);
}
