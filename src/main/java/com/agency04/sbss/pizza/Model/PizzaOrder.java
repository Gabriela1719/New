package com.agency04.sbss.pizza.Model;
import org.springframework.core.convert.Property;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pizzaOrder")
public class PizzaOrder
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "size")
    private Size size = Size.LARGE;
    @Column(name = "quantity")
    String quantity;

    @ManyToOne
    @JoinColumn(name="pizzeria_order")
    private Delivery delivery;

    @ManyToOne
    @JoinColumn(name="pizza")
    private Pizza pizza;

    public PizzaOrder(Size size)
    {
        this.size = size;
    }
    public PizzaOrder(){}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        PizzaOrder pizzaOrder = (PizzaOrder) o;
        return id == pizzaOrder.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash();
    }

    public Size getSize() {
        return size;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
