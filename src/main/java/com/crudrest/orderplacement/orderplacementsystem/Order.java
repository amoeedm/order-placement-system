package com.crudrest.orderplacement.orderplacementsystem;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="orders")

@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "customer_name")
    private String customerName;
}