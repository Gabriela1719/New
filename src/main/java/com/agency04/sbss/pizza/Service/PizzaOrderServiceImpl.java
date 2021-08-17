package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.PizzaOrder;
import com.agency04.sbss.pizza.Repository.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PizzaOrderServiceImpl implements  PizzaOrderService
{
    PizzaOrderRepository pizzaOrderRepository;
    @Autowired
    public PizzaOrderServiceImpl(PizzaOrderRepository thePizzaOrderRepository) {
        pizzaOrderRepository = thePizzaOrderRepository;
    }

    @Override
    public List<PizzaOrder> findAll() {
        return pizzaOrderRepository.findAll();
    }

    @Override
    public PizzaOrder findById(int theId) {
        Optional<PizzaOrder> result = pizzaOrderRepository.findById(theId);

        PizzaOrder thePizzaOrder = null;

        if (result.isPresent()) {
            thePizzaOrder = result.get();
        }
        else {
            throw new RuntimeException("Did not find pizza id - " + theId);
        }

        return thePizzaOrder;
    }

    @Override
    public void save(PizzaOrder thePizzaOrder) {
        pizzaOrderRepository.save(thePizzaOrder);
    }

    @Override
    public void deleteById(int theId) {
        pizzaOrderRepository.deleteById(theId);
    }

}
