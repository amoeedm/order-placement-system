package com.crudrest.orderplacement.orderplacementsystem;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="orders")

@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_phone")
    //@Size(min = 8, max = 12)
    private Integer phoneNumber;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "address_moving_from")
    private String addressMovingFrom;

    @Column(name = "address_moving_to")
    private String addressMovingTo;

    @Column(name = "moving")
    private Boolean moving;

    @Column(name = "packing")
    private Boolean packing;

    @Column(name = "cleaning")
    private Boolean cleaning;

    //@JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "service_date")
    private Date serviceDate;

    @Column(name = "order_note")
    private String orderNote;


}