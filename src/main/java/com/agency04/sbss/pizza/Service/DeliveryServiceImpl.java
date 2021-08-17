package com.agency04.sbss.pizza.Service;

import com.agency04.sbss.pizza.Model.Delivery;
import com.agency04.sbss.pizza.Repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("deliveryService")
public class DeliveryServiceImpl implements DeliveryService
{
    DeliveryRepository deliveryRepository;
    @Autowired
    public DeliveryServiceImpl(DeliveryRepository theDeliveryRepository) {
        deliveryRepository = theDeliveryRepository;
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery findById(int theId) {
        Optional<Delivery> result = deliveryRepository.findById(theId);

        Delivery theDelivery = null;

        if (result.isPresent()) {
            theDelivery = result.get();
        }
        else {
            throw new RuntimeException("Did not find pizza id - " + theId);
        }

        return theDelivery;
    }

    @Override
    public void save(Delivery theDelivery) {
        deliveryRepository.save(theDelivery);
    }

    @Override
    public void deleteById(int theId) {
        deliveryRepository.deleteById(theId);
    }

}
