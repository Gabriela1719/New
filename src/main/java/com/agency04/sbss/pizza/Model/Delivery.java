package com.agency04.sbss.pizza.Model;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "delivery")
public class Delivery
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "submissionDate")
    Date submissionDate;

    @ManyToOne
    @JoinColumn(name="delivery_id")
    private Customer customer;
    @OneToMany(mappedBy = "delivery")
    private List<PizzaOrder> pizzaOrders;

    public Delivery(Date submissionDate)
    {
        this.submissionDate = submissionDate;
    }
    public Delivery(){}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return id == delivery.id
                && (submissionDate.equals((delivery.submissionDate)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissionDate);
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }
}
