package com.agency04.sbss.pizza.Model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "phone")
    String phone;
    @OneToMany(mappedBy = "customer")
    private List<Delivery> deliveries;

    public Customer(int id, String username)
    {
        this.id = id;
        this.username = username;
    }
    public Customer() {}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id
                && (username.equals((customer.username)))
                && (phone.equals(customer.phone));
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, phone);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
