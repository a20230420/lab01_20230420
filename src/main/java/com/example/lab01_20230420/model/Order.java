package com.example.lab01_20230420.model;

import java.util.List;

public class Order {
    private String customerName;
    private String typeService;
    private List<Dish> dishes;

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getTypeService() {
        return typeService;
    }
    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    public List<Dish> getDishes() {
        return dishes;
    }
}
