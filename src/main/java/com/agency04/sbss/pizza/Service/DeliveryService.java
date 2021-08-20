package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Delivery;

import java.util.List;

public interface DeliveryService
{
    public List<Delivery> findAll();

    public Delivery findById(int theId);

    public void save(Delivery theDelivery);

    public void deleteById(int theId);

}
