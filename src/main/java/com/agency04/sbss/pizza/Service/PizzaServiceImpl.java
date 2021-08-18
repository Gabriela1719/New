package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Pizza;
import com.agency04.sbss.pizza.Repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("PizzaService")
public class PizzaServiceImpl implements PizzaService
{
    private PizzaRepository pizzaRepository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository thePizzaRepository) {
        pizzaRepository = thePizzaRepository;
    }

    @PostConstruct
    @Override
    public List<Pizza> findAll() {

            List<Pizza> thePizza;
            thePizza = new ArrayList<>();
            thePizza.add(new Pizza("Margarita", "Tomato sauce, mozzarella, and oregano"));
            thePizza.add(new Pizza("Marinara", "Tomato sauce, garlic and basil"));
            thePizza.add(new Pizza("Quattro Stagioni", "Tomato sauce, mozzarella, mushrooms, ham, artichokes, olives, and oregano"));
            thePizza.add(new Pizza("Carbonara", "Tomato sauce, mozzarella, parmesan, eggs, and bacon"));

        return pizzaRepository.findAll();
    }
    @Override
    public Pizza findById(int theId) {
        Optional<Pizza> result = pizzaRepository.findById(theId);
        return result.get();
    }

    @Override
    public void save(Pizza thePizza) {
        pizzaRepository.save(thePizza);
    }

    @Override
    public void deleteById(int theId) {
        pizzaRepository.deleteById(theId);
    }

}
