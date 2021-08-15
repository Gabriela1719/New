package com.agency04.sbss.pizza;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController
{
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
        theCustomer.add(new Customer("Gabriela"));
        return theCustomer.get(username);
    }
}
