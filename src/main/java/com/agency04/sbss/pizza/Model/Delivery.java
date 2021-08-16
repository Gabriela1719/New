package com.agency04.sbss.pizza.Model;

import com.agency04.sbss.pizza.Service.CustomerService;

import java.sql.Date;

public class Delivery
{
    CustomerService customerService;
    PizzaImpl pizzaimpl;
    Date submissionDate;

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
