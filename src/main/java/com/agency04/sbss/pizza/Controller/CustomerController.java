package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController
{
    CustomerService customerService;
    @GetMapping("/customer/{username}")
    public Customer getCustomer(@PathVariable int username)
    {
        List<Customer> theCustomer = new ArrayList<>();
        return theCustomer.get(username);
    }
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer theCustomer)
    {
        theCustomer.setId(0);
        customerService.save(theCustomer);
        return theCustomer;
    }
    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer theCustomer)
    {
        customerService.save(theCustomer);
        return theCustomer;
    }
    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomer(@PathVariable int customerId)
    {
        customerService.deleteById(customerId);
        return "Deleted customer id - " + customerId;
    }
}
