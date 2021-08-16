package com.agency04.sbss.pizza.Controller;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Model.PizzaImpl;
import com.agency04.sbss.pizza.Service.CustomerService;
import com.agency04.sbss.pizza.Service.DeliveryService;
import com.agency04.sbss.pizza.Service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController
{
    CustomerService customerService;
    DeliveryService deliveryService;
    @Autowired
    PizzeriaService pizzeriaService;
    private List<PizzaImpl> thePizza;
    @PostConstruct
    public void loadData() {
        thePizza = new ArrayList<>();

        thePizza.add(new PizzaImpl("Margarita", "Tomato sauce, mozzarella, and oregano"));
        thePizza.add(new PizzaImpl("Marinara", "Tomato sauce, garlic and basil"));
        thePizza.add(new PizzaImpl("Quattro Stagioni", "Tomato sauce, mozzarella, mushrooms, ham, artichokes, olives, and oregano"));
        thePizza.add(new PizzaImpl("Carbonara", "Tomato sauce, mozzarella, parmesan, eggs, and bacon"));

    }
    @GetMapping("/pizza")
    public List<PizzaImpl> getPizza(){
        return thePizza;
    }

    @GetMapping("/customer/{username}")
    public Customer getCustomer(@PathVariable int username)
    {
        List<Customer> theCustomer = new ArrayList<>();
        theCustomer.add(new Customer(0,"Gabriela"));
        return theCustomer.get(username);
    }
    @GetMapping("/pizzeria")
    public String getAll()
    {
        return pizzeriaService.getName()+" - "+pizzeriaService.getAdress();
    }
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer theCustomer)
    {
        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }
    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer theCustomer)
    {
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }
    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomer(@PathVariable int customerId)
    {
        customerService.deleteCustomer(customerId);
        return "Deleted customer id - " + customerId;
    }
    @PostMapping("/delivery/order")
    public String deliverOrder(@RequestBody  Customer customer)
    {
        return customerService.deliverOrder(customer)+ ", Your order is"+ thePizza;
    }
    @GetMapping("/delivery/list")
    public List<Delivery> getAllD()
    {
        return deliveryService.getDelivery();
    }
}
