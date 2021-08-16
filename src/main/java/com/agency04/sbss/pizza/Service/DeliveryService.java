package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Customer;
import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Model.Pizzeria;

import java.util.List;

public interface DeliveryService
{
    public List<Delivery> getDelivery();

    public Customer getCustomer(int theId);

}
