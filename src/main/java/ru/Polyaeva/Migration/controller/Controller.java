package ru.Polyaeva.Migration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.Polyaeva.Migration.repository.OrderRepository;


@RestController
@RequestMapping("/products/fetch-product")
public class Controller {
    private final OrderRepository orderRepository;

    @Autowired
    public Controller(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public String getProductName(@RequestParam String name) {
        return orderRepository.getProductName(name);
    }
}