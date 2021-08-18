package com.agency04.sbss.pizza.Model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
//@Table(name = "pizza")
public class Pizza
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "ingredients")
    private String ingredients;

    @OneToMany(mappedBy = "pizza")
    private List<PizzaOrder> pizzaOrders;

    public Pizza(){}
    public Pizza(String name, String ingredients){
        this.name=name;
        this.ingredients=ingredients;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return id == pizza.id
                && (name.equals((pizza.name)))
                && (ingredients.equals(pizza.ingredients));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }
}
