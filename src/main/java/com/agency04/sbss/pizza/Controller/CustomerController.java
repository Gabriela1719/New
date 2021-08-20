package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{username}")
    public String getCustomer(@PathVariable String username)
    {
        Customer theCustomer = customerService.findById(username);
        return theCustomer.getUserName();

    }
    @PostMapping
    public void addCustomer(@RequestBody Customer theCustomer)
    {
        customerService.save(theCustomer);
    }
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer theCustomer)
    {
        customerService.save(theCustomer);
        return theCustomer;
    }
    @DeleteMapping("/delete/{userName}")
    public void deleteCustomer(@PathVariable String userName)
    {
        customerService.deleteById(userName);
    }
}
