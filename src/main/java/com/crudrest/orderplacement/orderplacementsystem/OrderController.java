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
    @CrossOrigin(origins = "http://localhost:3000")
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
