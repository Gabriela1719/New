package com.agency04.sbss.pizza.Model;
import javax.persistence.*;

@Entity
@Table(name = "PizzaOrder")
public class PizzaOrder
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "size")
    Size size;

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
