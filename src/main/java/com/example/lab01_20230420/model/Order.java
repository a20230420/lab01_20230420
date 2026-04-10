package com.example.lab01_20230420.model;

import java.util.List;

public class Order {

    private String customerName;
    private String typeService;
    private List<Dish> dishes;
    private int totalTime;

    public Order(){

    }
    public Order(String customerName, String typeService, List<Dish> dishes, int totalTime) {
        this.customerName = customerName;
        this.typeService = typeService;
        this.dishes = dishes;
        this.totalTime = totalTime;
    }
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
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
    public int getTotalTime() {
        return totalTime;
    }
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
