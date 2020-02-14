package com.crudrest.orderplacement.orderplacementsystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository repository;

    OrderController(OrderRepository repository){
        this.repository = repository;
    }

    @GetMapping("/orders")
    List<Order> all(){
        return repository.findAll();
    }

    @PostMapping("/orders")
    Order newOrder(@RequestBody Order newOrder){
        return repository.save(newOrder);
    }
}
