package com.crudrest.orderplacement.orderplacementsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/orders/{id}")
    public Optional<Order> findAnOrder(@PathVariable Long id){
        return repository.findById(id);
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
