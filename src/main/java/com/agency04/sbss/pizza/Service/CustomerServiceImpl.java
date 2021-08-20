package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService
{

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository thecustomerRepository)
    {
        this.customerRepository = thecustomerRepository;
    }
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(String username) {
        Optional<Customer> result = customerRepository.findById(username);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            throw new RuntimeException("Did not find Customer " + username);
        }
    }

    @Override
    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }


    @Override
    public void deleteById(String username) {
        customerRepository.deleteById(username);
    }
}
