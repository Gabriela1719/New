package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Pizza;
import com.agency04.sbss.pizza.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService
{
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
        customerRepository = theCustomerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result = customerRepository.findById(theId);

        Customer theCustomer = null;

        if (result.isPresent()) {
            theCustomer = result.get();
        }
        else {
            throw new RuntimeException("Did not find Customer id - " + theId);
        }

        return theCustomer;
    }

    @Override
    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }

}
