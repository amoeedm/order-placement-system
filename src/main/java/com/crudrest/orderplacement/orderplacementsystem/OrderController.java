package com.crudrest.orderplacement.orderplacementsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private final OrderRepository repository;

    OrderController(OrderRepository repository){
        this.repository = repository;
    }

    @GetMapping("/orders")
    public List<Order> all(){
        return repository.findAll();
    }

    @PostMapping("/orders")
    public Order newOrder(@RequestBody Order newOrder){
        return repository.save(newOrder);
    }

    @DeleteMapping("/orders/{id}")
    public @ResponseBody void deleteOrder(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
