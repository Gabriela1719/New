package com.agency04.sbss.pizza.Model;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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
