package com.example.lab01_20230420.controller;

import com.example.lab01_20230420.model.Dish;
import com.example.lab01_20230420.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class HomeController {
    private List<Dish> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


    @GetMapping("/form")
    public String mostrarFormulario() {
        return "page";
    }

    @PostMapping("/form/guardar")
    public String guardarPedido(Order customer, Model model) {

        model.addAttribute("nombre", customer.getCustomerName());
        model.addAttribute("tipo", customer.getTypeService());
        model.addAttribute("dish", customer.getDishes());
        return "page";
    }

}

