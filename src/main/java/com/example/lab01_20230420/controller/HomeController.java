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

    public OrderController(){
        menu.add(new Dish("Ensalada Cesar", 12.5, 10));
        menu.add(new Dish("Sopa de Verduras", 9.0, 8));
        menu.add(new Dish("Lomo Saltado", 25.0, 20));
        menu.add(new Dish("ArrozChaufa", 18.5, 15));
        menu.add(new Dish("Limonada", 6.0, 3));
    }

    //Mostraremos el formulario
    @GetMapping("/form")
    public String showform(Model model) {
        model.addAttribute("menu", menu);
        model.addAttribute("order", new Order());
        return "form";
    }

    //Se guardará el pedido acá
    @PostMapping("/save")
    public String saveOrder(Order order, Model model) {
        if (order.getDishes() == null || order.getDishes().isEmpty()) {
            model.addAttribute("error", "Debe seleccionar al menos un plato");
            model.addAttribute("menu", menu);
            return "form";
        }

        int TotalTime = 0;
        for(Dish d : order.getDishes()){
            TotalTime += d.getPrepTime();
        }
        order.setTotalTime(TotalTime);

        orders.add(order);
        model.addAttribute("orders", orders);

        return "reporte";
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute("orders", orders);
        return "history";
    }

}

