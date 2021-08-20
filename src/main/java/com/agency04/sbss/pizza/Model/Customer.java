package com.agency04.sbss.pizza.Model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer{
    //@Id
    @GeneratedValue
    private int id;
    @Id
    @Column(name = "userName")
    private String userName;
    @Column(name = "phone")
    String phone;
    @OneToMany(mappedBy = "customer")
    private List<Delivery> deliveries;

    public Customer(int id, String userName, String phone)
    {
        this.id = id;
        this.userName = userName;
        this.phone = phone;
    }
    public Customer() {}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id
                && (userName.equals((customer.userName)))
                && (phone.equals(customer.phone));
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, phone);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
