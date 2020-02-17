package com.crudrest.orderplacement.orderplacementsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    //Not making set-method.
    @Autowired
    private final OrderRepository repository;

    OrderController(OrderRepository repository){
        this.repository = repository;
    }

    //GET: all
    @GetMapping("/orders")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Order> all(){
        return repository.findAll();
    }

    //GET: by {id}; checks if exists first.
    @GetMapping("/orders/{id}")
    public Optional<Order> findAnOrder(@PathVariable Long id){
        Optional<Order> order = repository.findById(id);
        if(order.isPresent()){
            return order;
        }
        else {
            throw new RuntimeException("Order not found, id: " + id);
        }
    }

    //POST
    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public Order newOrder(@RequestBody Order newOrder){
            return repository.save(newOrder);
    }

    //DELETE: by {id}; checks if exists first.
    @DeleteMapping("/orders/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody void deleteOrder(@PathVariable Long id) {
        Optional<Order> order = repository.findById(id);
        if(order.isPresent()){
            repository.deleteById(id);
        }
        else {
            throw new RuntimeException("Order not found, id: " + id);
        }
    }

    //PUT: by {id}; updates each old attribute entry with new entries.A
    @PutMapping("/orders/{id}")
    public @ResponseBody Order changeOrder(@PathVariable Long id, @RequestBody Order updateOrder) {
        Order currentOrder = repository.findById(id).orElse(null);
        currentOrder.setName(updateOrder.getName());
        currentOrder.setPhoneNumber(updateOrder.getPhoneNumber());
        currentOrder.setEmail(updateOrder.getEmail());
        currentOrder.setAddressMovingFrom(updateOrder.getAddressMovingFrom());
        currentOrder.setAddressMovingTo(updateOrder.getAddressMovingTo());
        currentOrder.setMoving(updateOrder.getMoving());
        currentOrder.setPacking(updateOrder.getPacking());
        currentOrder.setCleaning(updateOrder.getCleaning());
        currentOrder.setServiceDate(updateOrder.getServiceDate());
        currentOrder.setOrderNote(updateOrder.getOrderNote());
        return repository.save(currentOrder);
    }
}
